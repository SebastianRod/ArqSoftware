package com.accenture.java;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
	
	public String menuPrincipal() {
		System.out.println();
		System.out.println("*********** EL PARKING ************");
		System.out.println();
		System.out.println("Seleccione una opcion:");
		System.out.println("1. Mostrar puestos");
		System.out.println("2. Ingresar Vehiculo");
		System.out.println("3. Desocupar Puesto");
		System.out.println("4. Exportar");
		System.out.println("5. Salir");
		System.out.print("Opcion: ");
		
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
	
	public Vehiculo obtenerDatosVehiculo() {
		Scanner scan = new Scanner(System.in);
		Vehiculo vehiculo = null;
		
		
		System.out.println();
		System.out.print("ID vehiculo: ");
		String id = scan.nextLine();
		System.out.print("Tipo (1. Auto, 2. Moto, 3. Bici): ");
		String tipo = scan.nextLine();
		
		//validar tipo
		if (tipo.equals("1")) {
			System.out.print("Marca: ");
			String marca = scan.nextLine();
			System.out.print("Modelo: ");
			String modelo = scan.nextLine();
			System.out.print("Pasajeros: ");
			int pasajeros = scan.nextInt();
			scan.nextLine();
			Persona persona[] = new Persona[pasajeros];
			for (int i = 0; i < pasajeros; i++) {
				System.out.println("DATOS DEL CONDUCTOR");
				persona[i] =  obtenerDatosPersona();
				
			}
			vehiculo = new Automovil(id, marca, modelo, persona, pasajeros);
			
		} else if (tipo.equals("2")) {
			System.out.print("Marca: ");
			String marca = scan.nextLine();
			System.out.print("Tipo: ");
			String tipoMoto = scan.nextLine();
			System.out.print("Cilindraje: ");
			int cilindr = scan.nextInt();
			scan.nextLine();
			System.out.print("Pasajeros: ");
			int pasajeros = scan.nextInt();
			scan.nextLine();
			while(pasajeros > 2 || pasajeros <= 0){
				System.out.println("A la moto solo le entran 2!");
				System.out.print("Pasajeros: ");
				pasajeros = scan.nextInt();
				scan.nextLine();
			}
			Persona persona[] = new Persona[pasajeros];
			for (int i = 0; i < pasajeros; i++) {
				System.out.println("DATOS DEL CONDUCTOR");
				persona[i] =  obtenerDatosPersona();
			}
			vehiculo = new Motocicleta(id, persona, marca, tipoMoto, cilindr, pasajeros);
			
		} else {
			System.out.print("Rin: ");
			int rin = scan.nextInt();
			scan.nextLine();
			System.out.print("Electrica (S/N): ");
			String elec = scan.nextLine();
			System.out.print("Descripcion: ");
			String desc = scan.nextLine();
			
			boolean electrica = true;
			if (elec.equals("N")) {
				electrica = false;
			}
			Persona persona[] = new Persona[1];
			persona[0] = obtenerDatosPersona();
			vehiculo = new Bicicleta(id, rin, desc, electrica, persona);
		}
		
		return vehiculo;
	}
	
	public Persona obtenerDatosPersona(){
		Scanner scan = new Scanner(System.in);
		Persona persona = null;
		String nombre;
		String apellido;
		System.out.println("Ingrese nombre: ");
		nombre = scan.nextLine();
		System.out.println("Ingrese apellido: ");
		apellido = scan.nextLine();
		persona = new Persona(nombre, apellido);
		return persona;
	}
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Parqueadero parking = new Parqueadero(10);
		Main main = new Main();
		Scanner scan = new Scanner(System.in);
		
		parking.leer();
		
		String opc = null;
		do {
			opc = main.menuPrincipal();
			
			switch (opc) {
			case "1":
				parking.mostrarPuestos();
				break;
				
			case "2":
				System.out.print("Puesto: ");
				int puesto = scan.nextInt();
				scan.nextLine();
				
				if (parking.getPuesto(puesto).isOcupado()) {
					System.out.println("****** PAILAS: Ya hay un vehiculo en ese puesto!!");
				} else {
					parking.ocuparPuesto(puesto, main.obtenerDatosVehiculo());
					System.out.println("Puesto ocupado exitosamente!");
				}
					
				break;
				
			case "3":
				System.out.println("Ingrese posicion a liberar");
				int posicion = scan.nextInt();
				scan.nextLine();
				if (parking.getPuesto(posicion).isOcupado()) {
					parking.desocuparPuesto(posicion);
					System.out.println("Puesto liberado");
				}else
					System.out.println("El puesto ya esta libre");
				break;
				
			case "4":
				parking.exportar();
		     break;
			}
			
		} while (!opc.equals("5"));
		
		System.out.println("Gracias por utilizar nuestros servicios!!!");
		parking.guardar();
	}
}
