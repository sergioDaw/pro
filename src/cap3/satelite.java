package cap3;

	/**
 	*Modifica la clase satelite y añade los siguientes métodos:
 	*
		Método void variaAltura(double desplazamiento). Este método acepta un parámetro
		que será positivo o negativo dependiendo de si el satélite tiene que acercarse o
		alejarse a la Tierra.
		
		Método bolean enOrbita( ). Este método devolverá false si el satélite está en tierra y
		trae en caso contrario.
		
		Método void variaPosicion(double variap, double variam). Este método permite
		modificar los atributos de posición (meridiano y paralelo) mediante los parámetros
		variap y variam. Estos parámetros serán valores positivos o negativos relativos que
		harán al satélite modificar su posición.
	 
	 */

public class satelite { 

	private double meridiano;
	private double paralelo; 
	private double distancia_tierra;
	private double desplazamiento;
	
	satelite ( double m, double p, double d, double desplazamiento ) {
		meridiano = m;
		paralelo = p;
		distancia_tierra = d;
}
	satelite () {
		meridiano = paralelo = distancia_tierra = desplazamiento = 0;
		}
	
		public void setPosicion(double m, double p, double d ) {
			meridiano = m;
			paralelo = p;
			distancia_tierra = d; 
			}
		
		public void printPosicion( ) {
			System.out.println ( "El satellite se encuentra en el paralelo "
			+paralelo +" meridiano "+meridiano +" a una distancia de la tierra de " 
			+distancia_tierra +" kilómetros");
			} 
		
		
		public void variaAltura(double desplazamiento) {
			
			distancia_tierra = distancia_tierra + desplazamiento;
			
			if (desplazamiento >=0)
			{System.out.println("El satelite se aleja");}
			else 
			{System.out.println("El satelite se acerca");} 
	}
		
		boolean enObita() {
			if (distancia_tierra == 0){
				// si es igual  a 0, false se pone == porque es boolean
				return false;
						}
		return true;
		// en caso contrario returna true
		}
		
		public void variaPosicion(double variap, double variam){
			
			paralelo = paralelo + variap;
			meridiano = meridiano + variam;
			
		}
		
		
		public static void main(String[] ar) {
			
			satelite Philae;
			Philae = new satelite(10, 20, 30, 40);
			Philae.printPosicion();
			//probando
		}
		
}
