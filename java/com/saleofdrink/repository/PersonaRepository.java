package com.saleofdrink.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.saleofdrink.model.Persona;

public interface PersonaRepository extends JpaRepository<Persona, Long>{
	Page<Persona> findAllByEstper(String estper, Pageable pageable);
}
