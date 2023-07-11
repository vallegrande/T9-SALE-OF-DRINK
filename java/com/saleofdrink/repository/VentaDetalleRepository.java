package com.saleofdrink.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.saleofdrink.model.VentaDetalle;

public interface VentaDetalleRepository extends JpaRepository<VentaDetalle, Long>{
	Page<VentaDetalle> findAllByEstvendet(String estvendet, Pageable pageable);
}
