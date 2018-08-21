
public class Persona {

	
	String nombre;
	String apellido;
	
	public void imprimirPersona(){
		System.out.println(nombre + " " +apellido);
	}
	
	public void poblarDatos(String n, String apellido){
		this.nombre = n;
		this.apellido = apellido;
	}
	
	public Persona(String Nombre, String Apellido){
		this.nombre = Nombre;
		this.apellido = Apellido;
	}
	
}
