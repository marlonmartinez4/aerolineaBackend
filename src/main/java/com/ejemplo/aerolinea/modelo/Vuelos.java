package com.ejemplo.aerolinea.modelo;

import com.ejemplo.aerolinea.entity.VuelosEntidad;

public class Vuelos{

	private String fechar;
	
	private String origenr;
	
	private String destinor;
	
	private String hora;
	
	private String precior;

	public Vuelos() {
		
	}

	public Vuelos(String fechar, String origenr, String destinor, String hora, String precior) {
		
		this.fechar = fechar;
		this.origenr = origenr;
		this.destinor = destinor;
		this.hora = hora;
		this.precior = precior;
	}

	public Vuelos(VuelosEntidad vuelos) {
		this.fechar = vuelos.getFechar();
		this.origenr =vuelos.getOrigenr();
		this.destinor = vuelos.getDestinor();
		this.hora = vuelos.getHora();
		this.precior = vuelos.getPrecior();
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

	public String getDestino() {
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
