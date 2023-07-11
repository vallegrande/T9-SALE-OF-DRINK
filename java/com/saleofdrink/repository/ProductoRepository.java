package com.saleofdrink.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.saleofdrink.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{
	Page<Producto> findAllByEstpro(String estpro, Pageable pageable);
}
