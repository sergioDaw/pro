package cap4;

public class tigre extends felinos implements puedeNadar, puedeCaminar{
	
public tigre ( String especie, String color, int patas, boolean salvaje) {
	
	this.patas = patas;
	this.salvaje = salvaje;
}
	
//metodos
	public void nadar() {
		System.out.println("El tigre nada");
	}
	
	public void caminar() {
		System.out.println("El tigre camina");
	}

}
