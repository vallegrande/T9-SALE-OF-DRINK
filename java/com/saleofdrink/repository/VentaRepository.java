package com.saleofdrink.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.saleofdrink.model.Venta;

public interface VentaRepository extends JpaRepository<Venta, Long>{
	Page<Venta> findAllByEstven(String estven, Pageable pageable);
}
