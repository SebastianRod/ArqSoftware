
public class Parqueadero {
	Puesto[] losPuestos;
	
	
	public Parqueadero(int puestos){
		losPuestos = new Puesto[puestos];
		for(int i =0; i < losPuestos.length; i++){
			losPuestos[i] = new Puesto();
		}
	}
	public void ocupar(int posicion, String nombre, String apellido, int cedula, String placa, String modelo,String marca){
		Conductor c = new Conductor(nombre, apellido, cedula);
		Vehiculo v = new Vehiculo(placa, modelo, marca, c);
		this.losPuestos[posicion].ocupar(v);
	}
	
	
	public void liberar(int posicion){
		losPuestos[posicion] = new Puesto();
	}
	public void imprimirPuestos(){
		for(int i =0; i<losPuestos.length;i++){
			System.out.print("el puesto " + i + " esta ");
			losPuestos[i].imprimir();
	}
	
	}
}
