package com.accenture.java;

public class Bicicleta extends Vehiculo {

	private int rin;
	private boolean electrica;
	private String descripcion;
	
	public Bicicleta(String id, int r, String desc, boolean elec, Persona[] con) {
		super(id, con);
		this.electrica = elec;
		this.descripcion = desc;
		this.rin = r;
	}
	
	public String detalles(){
		String electrica = "Electrica";
		String detalles;
		if(this.electrica == false){
			electrica = "Normal";
		}
		detalles = "Es :"+ electrica +" con rin: "+ this.rin + " Descripcion: " + this.descripcion;
		return detalles;
	}

	public int getRin() {
		return rin;
	}

	public void setRin(int rin) {
		this.rin = rin;
	}

	public boolean isElectrica() {
		return electrica;
	}

	public void setElectrica(boolean electrica) {
		this.electrica = electrica;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
}
