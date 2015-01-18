package cap4;

public class gato extends felinos implements puedeNadar, puedeCaminar{
	
public gato ( String especie, String color, int patas, boolean salvaje) {
	
	this.patas = patas;
	this.salvaje = salvaje;
}
	
//metodos
	public void nadar() {
		System.out.println("El gato nada");
	}
	
	public void caminar() {
		System.out.println("El gato camina");
	}

}
