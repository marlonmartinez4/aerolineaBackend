package com.ejemplo.aerolinea.controlador;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.aerolinea.entity.VuelosEntidad;

import com.ejemplo.aerolinea.servicios.VuelosServicios;



@CrossOrigin(origins = {"http://localhost:8080"}, maxAge = 4800, allowCredentials = "false")
@RestController
public class VuelosControlador {

	@Autowired
	protected VuelosServicios vuelosser;
	
	@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000)
	@RequestMapping(value="/getVuelos", method=RequestMethod.GET)
	public List<VuelosEntidad>getVuelos(){
		return this.vuelosser.vuelos();
		
		
	}
	
	@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000)
	@RequestMapping(value="/getConsulta", method=RequestMethod.GET)
	public List<VuelosEntidad> getConsulta(String fe,String ori,String des){
		return this.vuelosser.findByFecharAndOrigenrAndDestinor(fe,ori,des);
		
	}
	@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000)
	@RequestMapping(value="/getoriDes", method=RequestMethod.GET)
	public List<String> getoriDes(){
		return this.vuelosser.oriDes();
		
	}
	@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000)
	@RequestMapping(value="/getdesOri", method=RequestMethod.GET)
	public List<String> getdesOri(){
		return this.vuelosser.desOri();
		
	}
}
