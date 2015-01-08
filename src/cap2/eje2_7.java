package cap2;
public class eje2_7 {

	/**
	 *Realiza un programa que muestre en pantalla los números del 1 al 100 sin mostrar aquellos números múltiplos de 5.
	 */
	
	public static void main(String[] args) {

		int num = 0;	
			
		while (num < 100){
		num++;
		//cuenta hasta 100, en cada vuelta suma +1
		
		if ( num%5==0) { continue;}
		//si la condicion se cumple, "salta" el numero y no lo imprime
		
		System.out.println(num);
		}
	}
}
