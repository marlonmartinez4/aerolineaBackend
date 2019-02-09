package com.ejemplo.aerolinea.entity;


import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.ejemplo.aerolinea.modelo.EntidadPa;

@Entity
@Table(name="reservas")
@Access(AccessType.FIELD)
public class Reservas extends EntidadPa {

	private static final long serialVersionUID = -1857073692225676414L;
	
	
	@Column(name="cedula",nullable=false,length=20)
	private String cedula;
	
	@Column(name="nombre", nullable=false, length=20)
	private String nombre;
	
	@Column(name="edad", nullable=false, length=20)
	private int edad;
	
	@Column(name="fechar",nullable=false, length=20)
	private String fechar;
	
	@Column(name="origenr",nullable=false, length=20)
	private String origenr;
	
	@Column(name="destinor",nullable=false, length=20)
	private String destinor;
	
	@Column(name="hora",nullable=false, length=20)
	private String hora;
	
	@Column(name="telefono",nullable=false, length=20)
	private String telefono;
	
	@Column(name="precior",nullable=false, length=20)
	private String precior;

	public Reservas() {
		
	}

	

	public Reservas(String cedula, String nombre, int edad, String fechar, String origenr, String destinor, String hora,
			String telefono, String precior) {
		
		this.cedula = cedula;
		this.nombre = nombre;
		this.edad = edad;
		this.fechar = fechar;
		this.origenr = origenr;
		this.destinor = destinor;
		this.hora = hora;
		this.telefono = telefono;
		this.precior = precior;
	}



	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
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

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getPrecior() {
		return precior;
	}

	public void setPrecior(String precior) {
		this.precior = precior;
	}
	
	
	
}
