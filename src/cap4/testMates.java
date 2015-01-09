package cap4;

import java.util.Scanner;

import utilidades.educacion.*;
//importamos el package 

public class testMates {
	
		public void setNum1() {
			Scanner keyboard = new Scanner(System.in);
	        System.out.print("Escribe el primer número: ");
	        int a = keyboard.nextInt();
		}
		
		public void setNum2() {
			Scanner keyboard = new Scanner(System.in);
	        System.out.print("Escribe el segundo número: ");
	        int b = keyboard.nextInt();
		}

	public static void main(String[] args) {
		
		testMates test = new testMates();
		
		test.setNum1();
		test.setNum2();
		
	}

}

/*test.sumar;
test.potencia;
*/