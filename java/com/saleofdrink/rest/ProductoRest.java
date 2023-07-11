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

import com.saleofdrink.model.Producto;
import com.saleofdrink.service.ProductoService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/producto/")
public class ProductoRest {
	
	@Autowired
	private ProductoService productoService;
	
	/* METODO LISTAR */
	@GetMapping
	private ResponseEntity<List<Producto>> getAllProducto(Pageable pageable) {
		return ResponseEntity.ok(productoService.findAllByEstpro("activo", pageable).getContent());
	}
	
	
	/* METODO GUARDAR */
	@PostMapping
	private ResponseEntity<Producto> saveProducto(@RequestBody Producto producto) {
		try {
			Producto productoGuardada = productoService.save(producto);
			return ResponseEntity.created(new URI("/producto/" + productoGuardada.getIdpro())).body(productoGuardada);
		} catch (Exception e) {
			System.out.println("error: " + e.getMessage());
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
		
		/* METODO ELIMINAR */
		@DeleteMapping(value = "delete/{idpro}")
		private ResponseEntity<Boolean> deleteProducto(@PathVariable("idpro") Long idpro) {
			productoService.deleteById(idpro);
			return ResponseEntity.ok(!(productoService.findById(idpro) != null));
	}
}
