package com.ejemplo.aerolinea.controlador;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ejemplo.aerolinea.entity.Reservas;
import com.ejemplo.aerolinea.servicios.ReservasServicios;
import com.ejemplo.aerolinea.util.RestResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@CrossOrigin(origins = {"http://localhost:8080"}, maxAge = 4800, allowCredentials = "false")
@RestController
public class ReservasControlador {

		@Autowired
		@Qualifier("servicio")
		protected ReservasServicios reservasservicios;
		
		protected ObjectMapper mapper;
		
		@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000)
		@RequestMapping(value="/save", method=RequestMethod.POST)
		public RestResponse save(@RequestBody String reservaJson) throws JsonParseException, JsonMappingException, IOException, SQLException {
			
			this.mapper=new ObjectMapper();
			
			Reservas reservas=this.mapper.readValue(reservaJson, Reservas.class);
			
			if(!this.validate(reservas)) {
				return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),"los campos obligatorios no estan diligenciados correctamente");
				
			}
			if(!this.isAcountExists(reservas.getCedula(), reservas.getFechar())) {
				this.reservasservicios.save(reservas);
				
				return new RestResponse(HttpStatus.OK.value(),"operacion exitosa");
			}
			
			
			
			return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(),"un usuario puede hacer solo una reserva al dia");
		}
		
		@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000)
		@RequestMapping(value="/getUsuariores", method=RequestMethod.GET)
		public List<Reservas>getUsuariores(){
			return this.reservasservicios.findAll();
			
		}
		
		@CrossOrigin(origins = {"http://localhost:4200"}, maxAge = 6000)
		@RequestMapping(value="/getConsultarCc", method=RequestMethod.GET)
		public List<Reservas> getConsultarCc(String cc){
			
			return this.reservasservicios.findByCedula(cc);
			
		}
		
	

		private boolean validate(Reservas usuarioreservado) {
			boolean isValid=true;
			
			if(StringUtils.trimToNull(usuarioreservado.getCedula())==null) {
				isValid=false;
			}
			
			if(StringUtils.trimToNull(usuarioreservado.getNombre())==null) {
				isValid=false;
			}
			
			if( usuarioreservado.getEdad()<18) {
				isValid=false;
			}
			
			if(StringUtils.trimToNull(usuarioreservado.getTelefono())==null) {
				isValid=false;
			}
			
			return isValid;
		
		}
		public boolean isAcountExists(String c, String f) throws SQLException{
				Connection  micon = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectojsp","root","");
		        String sql = "SELECT * FROM reservas  WHERE cedula= '"+c+"' AND fechar= '"+f+"'";
		        PreparedStatement ps = micon.prepareStatement(sql);
		        ResultSet rs = ps.executeQuery();
		        
		        return rs.next();
		    }
}
