package com.accenture.java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;

public class Parqueadero {
	private Puesto[] puestos;
	private Persona[] persona;
	FileWriter fichero = null;        
    PrintWriter pw = null;
	
	public Parqueadero(int cantidad) throws IOException {
		this.puestos = new Puesto[cantidad];
		
		for (int i = 0; i < puestos.length; i++) {
			this.puestos[i] = new Puesto();
		}
	}
	
	/**
	 * Ocupa un puesto o retorna FALSE en caso de que ya este ocupado
	 * @param pos Posicion
	 * @param veh Vehiculo
	 * @return
	 * @throws IOException 
	 */
	public boolean ocuparPuesto(int pos, Vehiculo veh) throws IOException {
		if (this.puestos[pos].isOcupado()) {
			return false;
		} else {
			this.puestos[pos].ocupar(veh);
			return true;
		}
	}
	
	/**
	 * Desocupa un puesto o retorna FALSE en caso de que este libre
	 * @param pos Posicion
	 * @param veh Vehiculo
	 * @return
	 */
	public boolean desocuparPuesto(int pos) {
		if (!this.puestos[pos].isOcupado()) {
			return false;
		} else {
			this.puestos[pos].desocupar();
			return true;
		}
	}
	
	public void mostrarPuestos() {
		for (int i = 0; i < puestos.length; i++) {
			if(puestos[i].getVehiculo() != null && puestos[i].getVehiculo().getConductor() != null){
				persona = puestos[i].getVehiculo().getConductor();
				System.out.print("Id: "+ i + "- " + puestos[i].mostrar()+" " );
				varios2();				
			}else
				System.out.println(i + "- " +"Libre");
		}
	}	
	
	
	public void guardar() throws IOException {
		ObjectOutputStream salida = new ObjectOutputStream( new FileOutputStream("C:\\Users\\juan.b.rodriguez\\Desktop\\persona.bin") );
		salida.writeObject(puestos);
		salida.close();
	}
	
	public Puesto[] leer() {
		try{
		ObjectInputStream entrada = new ObjectInputStream( new FileInputStream("C:\\Users\\juan.b.rodriguez\\Desktop\\persona.bin") );
		puestos = (Puesto[])entrada.readObject();
		entrada.close();
		}
		catch(IOException | ClassNotFoundException e){
			
		}
		return puestos;
	}
	
	
	public void varios(){
		for (int i = 0; i < persona.length; i++) {
			if(i == 0){
				pw.print(persona[i].mostrarPersona());
				pw.println("," +puestos[i].getVehiculo().detalles());
			}else{
				pw.println(",,,"+persona[i].mostrarPersona());
			}
		}
	}
	
	public void varios2(){
		for (int i = 0; i < persona.length; i++) {
			if(i == 0){
				System.out.print((persona[i].mostrarPersona()));
				System.out.println(", El vehiculo tiene los siguientes detalles: " +puestos[i].getVehiculo().detalles());
			}else{
				System.out.println(rellena(" ", 21)+persona[i].mostrarPersona());
			}
		}
	}
	
	public String rellena(String dato, int numero){
		while(dato.length() < numero){
			dato = dato + " ";
		}
		return dato;
	}
	public Puesto getPuesto(int pos) {
		return this.puestos[pos];
	}
	
	public void exportar(){
        try{
        	fichero = new FileWriter("C:\\Users\\juan.b.rodriguez\\Desktop\\persona.csv");
        	pw = new PrintWriter(fichero);
        	pw.println("Id,Estado,Id Cliente, Nombre Cliente, Detalles");
        	for (int i = 0; i < puestos.length; i++) {
    			if(puestos[i].getVehiculo() != null && puestos[i].getVehiculo().getConductor() != null){
    				persona = puestos[i].getVehiculo().getConductor();
    				pw.print( i + "," + puestos[i].mostrar2()+",");
    				varios();
    			}else
    				pw.println(i + ", " +"Libre");
    		}
        }
        catch
        (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           if (fichero != null)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
	}
}
