package com.saleofdrink.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "ventadetalle")

public class VentaDetalle {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDVENDET")
	private Long idvendet;
	
	
	@Column(name = "CANVENDET")
	private String canvendet;
	
	@Column(name = "PREVENDET")
	private String prevendet;
	
	@Column(name = "ESTVENDET")
	private String estvendet;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idven")
	private Venta venta;
	
	@ManyToOne
	@JoinColumn(name = "idpro")
	private Producto producto;
	
	
	public VentaDetalle(){
		
	}


	public VentaDetalle(String canvendet, String prevendet, String estvendet, Venta venta, Producto producto) {
		super();
		this.canvendet = canvendet;
		this.prevendet = prevendet;
		this.estvendet = estvendet;
		this.venta = venta;
		this.producto = producto;
	}


	public Long getIdvendet() {
		return idvendet;
	}


	public void setIdvendet(Long idvendet) {
		this.idvendet = idvendet;
	}


	public String getCanvendet() {
		return canvendet;
	}


	public void setCanvendet(String canvendet) {
		this.canvendet = canvendet;
	}


	public String getPrevendet() {
		return prevendet;
	}


	public void setPrevendet(String prevendet) {
		this.prevendet = prevendet;
	}


	public String getEstvendet() {
		return estvendet;
	}


	public void setEstvendet(String estvendet) {
		this.estvendet = estvendet;
	}


	public Venta getVenta() {
		return venta;
	}


	public void setVenta(Venta venta) {
		this.venta = venta;
	}


	public Producto getProducto() {
		return producto;
	}


	public void setProducto(Producto producto) {
		this.producto = producto;
	}

}
