package com.ejemplo.aerolinea.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ejemplo.aerolinea.entity.Reservas;

@Repository("repositorio")
public interface ReservasRepository extends JpaRepository<Reservas, Long>{
	
	@SuppressWarnings("unchecked")
	Reservas save(Reservas usuarioreservado);
	
	public abstract List<Reservas> findByCedula(String cedula);
	
	
}
