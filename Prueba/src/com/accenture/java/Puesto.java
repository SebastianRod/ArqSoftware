package com.accenture.java;

import java.io.Serializable;

public class Puesto implements Serializable{
	private boolean ocupado;
	private Vehiculo vehiculo;
	

	public void ocupar(Vehiculo v) {
		this.vehiculo = v;
		this.ocupado = true;
	}
	
	public void desocupar() {
		this.vehiculo = null;
		this.ocupado = false;
	}

	public boolean isOcupado() {
		return ocupado;
	}

	public boolean isLibre() {
		return !ocupado;
	}
	
	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	public String getEstado() {
		if (this.ocupado) {
			return "OCUPADO";
		} else {
			return "LIBRE";
		}
	}
	
	public String mostrar() {
		String x = this.getEstado();
		if (this.ocupado) {
			x = x + " - " + this.vehiculo.getIdentificador();
		}
		
		return x;
	}
	
	public String mostrar2() {
		String x = this.getEstado();
		if (this.ocupado) {
			x = x + "," + this.vehiculo.getIdentificador();
		}
		
		return x;
	}
}
