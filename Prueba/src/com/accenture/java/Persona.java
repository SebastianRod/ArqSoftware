package com.accenture.java;

import java.io.Serializable;

public class Persona implements Serializable {
	private String nombre;
	private String apellido;
	
	public Persona(String n, String a) {
		this.nombre = n;
		this.apellido = a;
	}
	
	public void imprimir() {
		System.out.println(this.nombre + " " + this.apellido);
	}
	
	public String mostrarPersona() {
		return this.nombre + " " + this.apellido;
	}
}
