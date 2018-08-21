package com.accenture.java;

public class Automovil extends Vehiculo {

	private String marca;
	private String modelo;
	private Persona[] pasajeros;
	
	
	public Automovil(String id, String mar, String mod, Persona[] con, int cantidadPasajeros) {
		super(id, con);
		this.marca = mar;
		this.modelo = mod;
		this.pasajeros = new Persona[cantidadPasajeros];
	}
	
	
	public String detalles(){
		String detalles;
		detalles = this.marca +" "+ this.modelo;
		return detalles;
	}

	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public Persona getPasajero(int pos) {
		return pasajeros[pos];
	}


	public void setPasajero(Persona pasajero, int pos) {
		this.pasajeros[pos] = pasajero;
	}
	
	

}
