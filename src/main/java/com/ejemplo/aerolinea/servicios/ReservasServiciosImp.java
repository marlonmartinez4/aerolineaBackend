package com.ejemplo.aerolinea.servicios;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.ejemplo.aerolinea.dao.ReservasRepository;
import com.ejemplo.aerolinea.entity.Reservas;


@Service("servicio")
public class ReservasServiciosImp implements ReservasServicios{
	
	@Autowired
	@Qualifier("repositorio")
	protected ReservasRepository reservasrepositorio;
	
	
	public Reservas save(Reservas usuarioreservado) {
		
		return this.reservasrepositorio.save(usuarioreservado);
	}

	
	public List<Reservas> findAll() {
		
		return this.reservasrepositorio.findAll();
	}

	@Override
	public List<Reservas> findByCedula(String cc) {
		
		return this.reservasrepositorio.findByCedula(cc);
	}

}
