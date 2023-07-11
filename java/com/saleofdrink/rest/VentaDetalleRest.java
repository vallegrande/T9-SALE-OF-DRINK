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

import com.saleofdrink.model.VentaDetalle;
import com.saleofdrink.service.VentaDetalleService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/ventadetalle/")


public class VentaDetalleRest {
	
	@Autowired
	private VentaDetalleService ventaDetalleService;
	
	/* METODO LISTAR */
	@GetMapping
	private ResponseEntity<List<VentaDetalle>> getAllVentaDetalle(Pageable pageable) {
		return ResponseEntity.ok(ventaDetalleService.findAllByEstvendet("activo", pageable).getContent());
	}
	
	
	/* METODO GUARDAR */
	@PostMapping
	private ResponseEntity<VentaDetalle> saveVentaDetalle(@RequestBody VentaDetalle ventadetalle) {
		try {
			VentaDetalle ventadetalleGuardada = ventaDetalleService.save(ventadetalle);
			return ResponseEntity.created(new URI("/ventadetalle/" + ventadetalleGuardada.getIdvendet())).body(ventadetalleGuardada);
		} catch (Exception e) {
			System.out.println("error: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	/* METODO ELIMINAR */
	@DeleteMapping(value = "delete/{idVenDet}")
	private ResponseEntity<Boolean> deleteVentaDetalle(@PathVariable("idVenDet") Long idvendet) {
		ventaDetalleService.deleteById(idvendet);
		return ResponseEntity.ok(!(ventaDetalleService.findById(idvendet) != null));
	}
}
