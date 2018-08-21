import java.util.Scanner;

/**
 * 
 * @author juan.b.rodriguez
 * @since 2/5/2017
 */
public class Main {

	public static void main(String[] args) {
		
		/*//Fibonacci
		int ini = 0;
		int sig = 0;
		int fibo ;	
		/*
		for(int i = 0; i <= 10 ; i++){
			fibo = ini + sig;
			ini = sig;
			sig = fibo;
			//System.out.println(fibo);
		}
		//Fin Fibonacci
		*/
		
		
		/*//Llenar un arreglo con la fibonacci
		int[] arrFibo = new int[10];
		for(int i = 0; i < arrFibo.length ; i++){
			fibo = ini + sig;
			ini = sig;
			sig = fibo;
			arrFibo[i] = fibo;			
		}
		for (int i : arrFibo) {
			System.out.println(i);
		}*/
		
		/*
		int[][] tabla = new int [5][5];
		for(int f=0; f < 5; f++){
			for(int c=0; c < 5; c++){
				tabla[f][c] = ini*3;
				ini++;
			}
		}
		for (int[] is : tabla) {
			for (int i : is) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
		//Matrices
		/*
		int[][] matriz = new int[][]{
			{1,2,3,4,5},
			{11,12,13,14,15},
			{21,22,23,24,25},
			{31,32,33,34,35},
			{41,42,43,44,45}
		};
		for(int f=0;f<5;f++){
			for(int c=0;c<5;c++){
				//System.out.print(matriz[f][c]+ " ");
			}
			//System.out.println();
		}
		
		//Matriz con for each
		for (int[] is : matriz) {
			for (int i : is) {
				//System.out.print(i + " ");
			}
			//System.out.println();
		}
		*/
		
		/*EJEMPLO DE LAS SALAS
		Sala salon = new Sala(2);
		salon.sentarPersona("Juan", "R", 0);
		salon.mostrarSillas();
		*/
		
		
		/*EJEMPLO DE PARQUEADERO
		Parqueadero parq = new Parqueadero(5);
		parq.ocupar(2, "Juan", "Rodriguez", 1234, "CAR33E", "moto", "Yamaha");
		parq.ocupar(4, "Juan", "Rodriguez", 1234, "CAR33E", "moto", "Yamaha");
		parq.imprimirPuestos();
		*/
		
		Main p = new Main();
		
		
		String opcion;
		int posicion;
		String nombre;
		String apellido;
		int cedula;
		String placa;
		String modelo;
		String marca;
		Parqueadero parq = new Parqueadero(2);
		
		do {
			opcion = p.mostrarMenu();
			
			switch (opcion) {
			case "1":
				Scanner scan = new Scanner(System.in);
				System.out.println("Ingrese posicion");
				posicion = scan.nextInt();
				scan.nextLine();
				System.out.println("Ingrese nombre");
				nombre = scan.nextLine();
				System.out.println("Ingrese apellido");
				apellido = scan.nextLine();
				System.out.println("Ingrese cedula");
				cedula = scan.nextInt();
				scan.nextLine();
				System.out.println("Ingrese placa");
				placa = scan.nextLine();
				System.out.println("Ingrese modelo");
				modelo = scan.nextLine();
				System.out.println("Ingrese marca");
				marca = scan.nextLine();
				parq.ocupar(posicion, nombre, apellido, cedula, placa, modelo, marca);
				break;

			case "2":
				System.out.println("Ingrese posicion a liberar");
				Scanner lector = new Scanner(System.in);
				posicion = lector.nextInt();
				parq.liberar(posicion);
				break;
				
			case "3":
				parq.imprimirPuestos();
				break;
			default:
				break;
			}
			
		} while (!opcion.equals("q"));
		
		
	}
	
	void limpiarPantalla() {
		for (int i = 0; i < 50; i++) {
			System.out.println();
		}
	}
	
	String mostrarMenu() {
		limpiarPantalla();
		
		System.out.println("***************************");
		System.out.println("Seleccione una opcion");
		System.out.println(" 1 - Ingresar auto");
		System.out.println(" 2 - Sacar auto");
		System.out.println(" 3 - Imprimir estados");
		System.out.println(" 4 - Salir");
		
		Scanner scan = new Scanner(System.in);
		return scan.nextLine();
	}
}



