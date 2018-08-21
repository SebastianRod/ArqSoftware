
public class Puesto {
	boolean estado = false;
	Vehiculo carro;
	
	
	
	void imprimir(){
		if(this.estado == true){
			System.out.print("Ocupado por "+ " ");
			carro.imprimir();
			}else{
				System.out.println("Libre"+ " ");
			}
	}
	
	void ocupar(Vehiculo v){
		estado = true;
		this.carro = v;
	}
}
