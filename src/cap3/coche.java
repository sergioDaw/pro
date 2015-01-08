package cap3;

	/**
	 *Crea la clase coche con dos constructores. Uno no toma parámetros y el otro sí. Los
	dos constructores inicializarán los atributos marca y modelo de la clase. Crea dos objetos (cada
	objeto llama a un constructor distinto) y verifica que todo funciona correctamente.
	 */

public class coche {

	private String marca;
	private String modelo;
	
	coche() {
		marca = "Audi";
		modelo = "A3";
	
	System.out.println("Constructor 1: " +marca +" " +modelo);
	//prueba
	}
	//constructor 1? con parametros
	
	coche(String a, String b) {
		marca = a; 
		modelo = b;
	
	System.out.println("Constructor 2: " +marca +" " +modelo);
	//prueba
	}
	//constructor 2 iniciazamos los atributos
	
public static void main(String[] ar) {
		
		coche c1, c2;
        //nuevos objetos 

		c1 = new coche();
		c2 = new coche("Kia", "Picanto");
		//c2 introducimos los valores del  atributo
       
        }

}
