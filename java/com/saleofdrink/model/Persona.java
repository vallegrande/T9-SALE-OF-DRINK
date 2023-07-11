package com.saleofdrink.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@Entity
@Table(name = "persona")
public class Persona {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "IDPER")
	private Long idper;
	
	@Column(name = "NOMPER")
	private String nomper;
	
	@Column(name = "APEPER")
	private String apeper;
	
	@Column(name = "CELPER")
	private String celper;
	
	@Column(name = "CORPER")
	private String corper;
	
	@Column(name = "DNIPER")
	private String dniper;
	
	@Column(name = "USEPER")
	private String useper;
	
	@Column(name = "CONPER")
	private String conper;
	
	@Column(name = "TIPPER")
	private String tipper;
	
	@Column(name = "ESTPER")
	private String estper;
	

	public Persona() {
		 
	}

	public Persona(String nomper, String apeper, String celper, String corper, String dniper, String useper,
			String conper, String tipper, String estper) {
		super();
		this.nomper = nomper;
		this.apeper = apeper;
		this.celper = celper;
		this.corper = corper;
		this.dniper = dniper;
		this.useper = useper;
		this.conper = conper;
		this.tipper = tipper;
		this.estper = estper;
	}

	public Long getIdper() {
		return idper;
	}

	public void setIdper(Long idper) {
		this.idper = idper;
	}

	public String getNomper() {
		return nomper;
	}

	public void setNomper(String nomper) {
		this.nomper = nomper;
	}

	public String getApeper() {
		return apeper;
	}

	public void setApeper(String apeper) {
		this.apeper = apeper;
	}

	public String getCelper() {
		return celper;
	}

	public void setCelper(String celper) {
		this.celper = celper;
	}

	public String getCorper() {
		return corper;
	}

	public void setCorper(String corper) {
		this.corper = corper;
	}

	public String getDniper() {
		return dniper;
	}

	public void setDniper(String dniper) {
		this.dniper = dniper;
	}

	public String getUseper() {
		return useper;
	}

	public void setUseper(String useper) {
		this.useper = useper;
	}

	public String getConper() {
		return conper;
	}

	public void setConper(String conper) {
		this.conper = conper;
	}

	public String getTipper() {
		return tipper;
	}

	public void setTipper(String tipper) {
		this.tipper = tipper;
	}

	public String getEstper() {
		return estper;
	}

	public void setEstper(String estper) {
		this.estper = estper;
	}
}
