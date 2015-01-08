package cap2;
import java.util.*;

public class eje2_4 {

	
	public static void main ( String [ ] args) {
		
	Random rnd = new Random();
	
	int valor = rnd.nextInt(200-100+1)+100;
	
	// 200 es el tope, 100 es donde empieza el rango
	//http://deerme.org/java/numeros-aleatorios-en-java
	//http://puntocomnoesunlenguaje.blogspot.com.es/2012/07/generacion-de-numeros-aleatorios-en-java.html
	
	System.out.println(valor);
	
	if ( valor%2==0){
		//el valor resultante del resto es 0, es par
		
		System.out.println ("Es un número par!");
	}
	else {
		System.out.println ("Es un número impar");
	}
	
	}
}
