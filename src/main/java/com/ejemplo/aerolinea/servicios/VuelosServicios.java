package com.ejemplo.aerolinea.servicios;

import java.util.List;

import com.ejemplo.aerolinea.entity.VuelosEntidad;


public interface VuelosServicios {

	List<VuelosEntidad> vuelos();
	List<VuelosEntidad> findByFecharAndOrigenrAndDestinor(String fechar,String origenr,String destinor);
	 List<String> oriDes();
	 List<String> desOri();
}
