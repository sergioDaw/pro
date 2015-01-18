package cap4;

public class murcielago extends mamifero implements puedeNadar, puedeVolar{

	private int patas;
	private boolean salvaje;

	public murcielago ( String especie, String color, int patas, boolean salvaje) {
		
		this.patas = patas;
		this.salvaje = salvaje;
	}
		
	//metodos
		public void nadar() {
			System.out.println("El murcielago nada");
		}
		
		public void volar() {
			// TODO Auto-generated method stub
			
		}

	}