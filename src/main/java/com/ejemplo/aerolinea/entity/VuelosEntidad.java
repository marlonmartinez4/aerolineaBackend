package com.ejemplo.aerolinea.entity;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ejemplo.aerolinea.modelo.EntidadVue;

@Entity
@Table(name="consultarvuelos")
@Access(AccessType.FIELD)
public class VuelosEntidad extends EntidadVue{

	private static final long serialVersionUID = 4772088167266630643L;
	
	@Column(name="fecha",nullable=false,length=20)
	private String fechar;
	
	@Column(name="origen",nullable=false,length=20)
	private String origenr;
	
	@Column(name="destino",nullable=false,length=20)
	private String destinor;
	
	@Column(name="hora",nullable=false,length=20)
	private String hora;
	
	@Column(name="precio",nullable=false,length=20)
	private String precior;

	public VuelosEntidad() {
		
	}

	public VuelosEntidad(String fechar, String origenr, String destinor, String hora, String precior) {
		
		this.fechar = fechar;
		this.origenr = origenr;
		this.destinor = destinor;
		this.hora = hora;
		this.precior = precior;
	}

	public String getFechar() {
		return fechar;
	}

	public void setFechar(String fechar) {
		this.fechar = fechar;
	}

	public String getOrigenr() {
		return origenr;
	}

	public void setOrigenr(String origenr) {
		this.origenr = origenr;
	}

	public String getDestinor() {
		return destinor;
	}

	public void setDestinor(String destinor) {
		this.destinor = destinor;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getPrecior() {
		return precior;
	}

	public void setPrecior(String precior) {
		this.precior = precior;
	}
	
	

}
