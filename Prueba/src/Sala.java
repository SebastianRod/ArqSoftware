
public class Sala {
	int ancho;
	int largo;
	int cantidad;
	Silla[] lasSillas;
	
	public Sala(int cantidad){
		this.cantidad = cantidad;
		lasSillas =  new Silla[cantidad];
		for(int i = 0; i < lasSillas.length ; i++){
			lasSillas[i] = new Silla();
		}
	}
	
	void poblarDatosSala(int ancho, int largo){
		this.ancho = ancho;
		this.largo = largo;
	}
	/*
	void llenarDatosPersona(){
		this.lasPersonas[0] = new Persona("Sebastian","Rodriguez",21);
		this.lasPersonas[1] = new Persona("Jose","Rodriguez",22);
	}
	
	void imprimirGente(){
		for(int i=0; i<lasPersonas.length; i++){
			lasPersonas[i].imprimirPersona();
		}
	}
	*/
	void sentarPersona(String Nombre, String Apellido, int posicion){
			Persona p1 = new Persona(Nombre, Apellido);
			this.lasSillas[posicion].ocuparSilla(p1);
	}
	
	void mostrarSillas(){
		for(int i =0; i<lasSillas.length;i++){
			System.out.print("La silla "+ i + " esta " );
			lasSillas[i].imprimir();
		}
	}
}
