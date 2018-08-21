
public class Conductor {
	String nombre;
	String apellido;
	int cedula;
	
	
	public void imprimir(){
		System.out.println(nombre + " " +apellido + " con cedula " + cedula);
	}
	
	public Conductor(String Nombre, String Apellido, int Cedula){
		this.nombre = Nombre;
		this.apellido = Apellido;
		this.cedula = Cedula;
	}
}
