package cap4;

import utilidades.educacion.*;

public class testMates {

	public static void main(String[] args) {
		
		sumar test1 = new sumar();
		int resultadoSuma=test1.suma(2, 3);
		
		System.out.println(+resultadoSuma);
		
		potenciar test2 = new potenciar();
		int resultadoPotencia=test2.elevar(4, 2);
		
		System.out.println(+resultadoPotencia);
		
		
	}

}
