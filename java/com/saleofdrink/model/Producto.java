package com.saleofdrink.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDPRO")
	private Long idpro;
	
	@Column(name = "NOMPRO")
	private String nompro;
	
	@Column(name = "CANPRO")
	private String canpro;
	
	@Column(name = "PRECPRO")
	private String precpro;
	
	@Column(name = "ESTPRO")
	private String estpro;
	
	public Producto(){
	
	}

	public Producto(String nompro, String canpro, String precpro, String estpro) {
		super();
		this.nompro = nompro;
		this.canpro = canpro;
		this.precpro = precpro;
		this.estpro = estpro;
	}

	public Long getIdpro() {
		return idpro;
	}

	public void setIdpro(Long idpro) {
		this.idpro = idpro;
	}

	public String getNompro() {
		return nompro;
	}

	public void setNompro(String nompro) {
		this.nompro = nompro;
	}

	public String getCanpro() {
		return canpro;
	}

	public void setCanpro(String canpro) {
		this.canpro = canpro;
	}

	public String getPrecpro() {
		return precpro;
	}

	public void setPrecpro(String precpro) {
		this.precpro = precpro;
	}

	public String getEstpro() {
		return estpro;
	}

	public void setEstpro(String estpro) {
		this.estpro = estpro;
	}




}
