
public class Silla {
	boolean estado = false;
	Persona p ;
	
	void ocuparSilla(Persona persona){
		estado = true;
		this.p = persona;
	}
	
	void imprimir(){
		if(this.estado == true){
		System.out.print("Ocupado por:"+ " ");
		p.imprimirPersona();
		}else{
			System.out.print("Libre"+ " ");
		}
	}
}
