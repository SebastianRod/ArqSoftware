package com.accenture.java;

import java.io.Serializable;

public class Vehiculo implements Serializable{
	private Persona[] conductor;
	private String identificador;
	
	public Vehiculo(String id, Persona con[]) {
		this.identificador = id;
		this.conductor = con;
	}

	public Persona[] getConductor() {
		return conductor;
	}

	public void setConductor(Persona[] conductor) {
		this.conductor = conductor;
	}

	public String getIdentificador() {
		return identificador;
	}

	public void setIdentificador(String identificador) {
		this.identificador = identificador;
	}
	
	public String detalles(){
		String detalles = null;
		return detalles;
	}
}
