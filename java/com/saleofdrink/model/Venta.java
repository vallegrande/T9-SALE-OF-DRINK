package com.saleofdrink.model;


import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table (name = "venta")
public class Venta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "IDVEN")
	private Long idven;
	
	@Column(name = "FECVEN")
	private String fecven;
	
	@Column(name = "TIPPAGVEN")
	private String tippagven;
	
	@Column(name = "ESTVEN")
	private String estven;
	
	@OneToMany(mappedBy = "venta", cascade = CascadeType.ALL)
	private List<VentaDetalle> ventaDetalles;
	
	@ManyToOne
	@JoinColumn(name = "idper")
	private Persona persona;
	
	public Venta() {
		
	}

	public Venta(String fecven, String tippagven, String estven, List<VentaDetalle> ventaDetalles, Persona persona) {
		super();
		this.fecven = fecven;
		this.tippagven = tippagven;
		this.estven = estven;
		this.ventaDetalles = ventaDetalles;
		this.persona = persona;
	}

	public Long getIdven() {
		return idven;
	}

	public void setIdven(Long idven) {
		this.idven = idven;
	}

	public String getFecven() {
		return fecven;
	}

	public void setFecven(String fecven) {
		this.fecven = fecven;
	}

	public String getTippagven() {
		return tippagven;
	}

	public void setTippagven(String tippagven) {
		this.tippagven = tippagven;
	}

	public String getEstven() {
		return estven;
	}

	public void setEstven(String estven) {
		this.estven = estven;
	}

	public List<VentaDetalle> getVentaDetalles() {
		return ventaDetalles;
	}

	public void setVentaDetalles(List<VentaDetalle> ventaDetalles) {
		this.ventaDetalles = ventaDetalles;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}	
}
