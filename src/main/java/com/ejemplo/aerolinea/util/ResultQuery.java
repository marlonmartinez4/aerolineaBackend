package com.ejemplo.aerolinea.util;

import java.util.List;

public class ResultQuery {
	private int totalrecords;
	 private List<Object>lista;
	 
	public int getTotalrecords() {
		return totalrecords;
	}
	
	public void setTotalrecords(int totalrecords) {
		this.totalrecords = totalrecords;
	}
	
	public List<Object> getLista() {
		return lista;
	}
	
	public void setLista(List<Object> lista) {
		this.lista = lista;
	}
}
