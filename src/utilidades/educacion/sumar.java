package utilidades.educacion;

/*
 * Crea un paquete Utilidades.mates con dos clases: sumar y potenciar. La clase
sumar tendrá un método int suma(int, int) que devolverá la suma de los dos parámetros
introducidos y la clase potenciar tendrá un método potencia(int, int) que devolverá el resultado
de elevar el primer parámetro al segundo parámetro. Realiza un programa que haga uso de
este paquete.
*/

import java.util.Scanner;

public class sumar {
	
	private Scanner keyboard;

	int num1, num2, resultadoSuma;
	
	public void suma(int a, int b){
		 num1 = a;
		 num2 = b;
		 
		 resultadoSuma = a+b;
		 
		 return resultadoSuma;
		 
		
	}

}
