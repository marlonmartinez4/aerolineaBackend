package com.ejemplo.aerolinea.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import com.ejemplo.aerolinea.entity.VuelosEntidad;


public interface VuelosRepositorio extends JpaRepository<VuelosEntidad, Long>{
	
	public abstract List<VuelosEntidad> findByFecharAndOrigenrAndDestinor(String fecha,String origen,String destino);
	
}
