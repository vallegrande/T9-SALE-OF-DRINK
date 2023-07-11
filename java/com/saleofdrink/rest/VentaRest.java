package com.saleofdrink.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.saleofdrink.model.Venta;
import com.saleofdrink.model.VentaDetalle;
import com.saleofdrink.service.VentaDetalleService;
import com.saleofdrink.service.VentaService;

/*@CrossOrigin(origins = "http://localhost:58018")*/
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/venta/")

public class VentaRest {

	@Autowired
	private VentaService ventaService;

	@Autowired
	private VentaDetalleService ventaDetalleService;
	
	/* METODO LISTAR */
	@GetMapping
	private ResponseEntity<List<Venta>> getAllVenta(Pageable pageable) {
		return ResponseEntity.ok(ventaService.findAllByEstven("activo", pageable).getContent());
	}

	/* METODO GUARDAR */
	@PostMapping
	private ResponseEntity<Venta> saveVenta(@RequestBody Venta venta) {
		try {
			List<VentaDetalle> detalles = venta.getVentaDetalles();
			venta.setVentaDetalles(null);
			Venta ventaGuardada = ventaService.save(venta);
			detalles.forEach(detalle -> {
				detalle.setVenta(ventaGuardada);
				ventaDetalleService.save(detalle);
			});
			ventaGuardada.setVentaDetalles(detalles);
			return ResponseEntity.created(new URI("/venta/" + ventaGuardada.getIdven())).body(ventaGuardada);
		} catch (Exception e) {
			System.out.println("error: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	/* METODO ELIMINAR */
	@DeleteMapping(value = "delete/{idVen}")
	private ResponseEntity<Boolean> deleteVenta(@PathVariable("idVen") Long idven) {
		ventaService.deleteById(idven);
		return ResponseEntity.ok(!(ventaService.findById(idven) != null));
	}
}
