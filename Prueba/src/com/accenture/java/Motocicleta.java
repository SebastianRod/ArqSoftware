package com.accenture.java;

public class Motocicleta extends Vehiculo {

	private int cilindraje;
	private String marca;
	private String tipo;
	private Persona[] pasajero;
	
	
	public Motocicleta(String id, Persona[] con, String mar, String tip, int cili, int pas) {
		super(id, con);
		this.marca = mar;
		this.tipo = tip;
		this.cilindraje = cili;
		this.pasajero = new Persona[pas];
	}

	public String detalles(){
		String detalles;
		detalles = this.marca +" "+this.tipo +" "+this.cilindraje;
		return detalles;
	}
	
	public int getCilindraje() {
		return cilindraje;
	}

	public void setCilindraje(int cilindraje) {
		this.cilindraje = cilindraje;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Persona[] getPasajero() {
		return pasajero;
	}

	public void setPasajero(Persona[] pasajero) {
		this.pasajero = pasajero;
	}

	
}
