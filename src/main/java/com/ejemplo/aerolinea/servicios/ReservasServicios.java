package com.ejemplo.aerolinea.servicios;

import java.util.List;

import com.ejemplo.aerolinea.entity.Reservas;

public interface ReservasServicios {

	Reservas save(Reservas usuarioreservado);

	List<Reservas> findAll();

	List<Reservas> findByCedula(String cc);
	
}
