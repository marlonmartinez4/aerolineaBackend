package com.ejemplo.aerolinea.servicios;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ejemplo.aerolinea.dao.VuelosRepositorio;
import com.ejemplo.aerolinea.entity.VuelosEntidad;

@Service
public class VuelosServiciosImpl implements VuelosServicios{

	@Autowired
	protected VuelosRepositorio vuelosrepo;
	
	
	@Override
	public List<VuelosEntidad> vuelos() {
		return this.vuelosrepo.findAll();
	}


	@Override
	public List<VuelosEntidad> findByFecharAndOrigenrAndDestinor(String fechar, String origenr, String destinor) {
		
		return this.vuelosrepo.findByFecharAndOrigenrAndDestinor(fechar, origenr, destinor);
	}

	public List<String> oriDes(){
		ArrayList<String>  con  =new ArrayList<String>();
		try {
			Connection  micon = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectojsp","root","");
			 Statement st=micon.createStatement();
             String consulta="SELECT DISTINCTROW origen FROM consultarvuelos";
             ResultSet rs=st.executeQuery(consulta);
             while(rs.next()){
                 con.add(rs.getString(1));
             }
             rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	public List<String> desOri(){
		ArrayList<String>  con  =new ArrayList<String>();
		try {
			Connection  micon = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyectojsp","root","");
			 Statement st=micon.createStatement();
             String consulta="SELECT DISTINCTROW destino FROM consultarvuelos";
             ResultSet rs=st.executeQuery(consulta);
             while(rs.next()){
                 con.add(rs.getString(1));
             }
             rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
}
