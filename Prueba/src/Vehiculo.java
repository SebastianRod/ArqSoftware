
public class Vehiculo {
	String placa;
	String modelo;
	String marca;
	Conductor Conductor;
	
	
	void imprimir(){
		System.out.print("el vehiculo con placa "+ placa + " de marca " + marca + " y su propietario es ");
		Conductor.imprimir();
	}
	
	public Vehiculo(String placa, String modelo,String marca,Conductor c){
		this.placa = placa;
		this.modelo = modelo;
		this.marca = marca;
		Conductor = c;
	}
}
