package cap4;

public class pez implements Cloneable{

	public String nombre;
	private static int numPeces = 1;

//wtf? investigar	
	public Object clone( ) {
		Object objeto = null;
		try {
		objeto = super.clone( );
		} catch (CloneNotSupportedException ex) {
		System.out.println("Error al duplicar");
		}
		return objeto;
		}

//constructores
	pez (String nom) {
		
		nombre = nom;
		numPeces++;
	}
	
	pez (pez pez) {
		this.nombre = pez.getNombre();
		
	}
	
//getters y setters	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public int getPeces() {
		return numPeces;
	}
	

//metodo MAIN
	public static void main(String[] args) {
		
		pez pez1 = new pez("Wanda");
		
		pez pez2 = (pez)pez1.clone();
		
		pez2.setNombre("Nemo");
		
		pez pez4 = new pez("Sharknado");
		pez pez5 = new pez("Eco the Dolphin");
		
		System.out.println("Nombre del 1º pez es "+pez1.getNombre());
		System.out.println("Nombre del 2º pez es "+pez2.getNombre());
		System.out.println("Nombre del 5º pez es "+pez5.getNombre());
		
		System.out.println("Son iguales... "+pez1.equals(pez2));
		
		System.out.println("Numero de peces "+ pez5.getPeces( ));
		
//para eje 7 prueba y nuevo obj.
		pez pez3 = new pez(pez4);
		
		System.out.println("Nombre del 3º pez es "+pez3.getNombre());

	}

}
/*if (pez2.equals(pez1)) {
			System.out.println("Nombre del 1º pez y del 2º NO son iguales");
		}
		else System.out.println("Nombre del 1º pez y del 2º son iguales");*/
//eclipse > source > generate geetters and setters > elegir variable

/*
http://www.aprenderaprogramar.es/index.php?option=com_content&
view=article&id=584:ejercicio-y-ejemplo-resuelto-interface-cloneable
-y-metodo-clone-del-api-java-como-duplicar-objetos-cu00910c&catid=58:
curso-lenguaje-programacion-java-nivel-avanzado-i&Itemid=180

*/