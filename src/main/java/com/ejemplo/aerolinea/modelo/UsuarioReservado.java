package com.ejemplo.aerolinea.modelo;



import com.ejemplo.aerolinea.entity.Reservas;

public class UsuarioReservado{


	private String cedula;
	
	private String nombre;
	
	private int edad;
	
	private String fechar;
	
	private String origenr;
	
	private String destinor;
	
	private String hora;
	
	private String telefono;
	
	private String precior;

	public UsuarioReservado(String cedula, String nombre, int edad, String fechar, String origenr, String destinor,
			String hora, String telefono, String precior) {
		super();
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


	public UsuarioReservado() {
		
	}
	

	public UsuarioReservado(Reservas re) {
		this.cedula = re.getCedula();
		this.nombre = re.getNombre();
		this.edad = re.getEdad();
		this.fechar = re.getFechar();
		this.origenr = re.getOrigenr();
		this.destinor = re.getDestinor();
		this.hora = re.getHora();
		this.telefono = re.getTelefono();
		this.precior = re.getPrecior();
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
