package cap2;

public class eje2_3 {

	public static void main(String[] args) {
		
		int a=0; int b=0; int c=0; int d=0;
		 
		while (a <= 10) {
			//mientras sea menor o igual a 10 se ejecuta este bucle
			
			System.out.println (); //linea en blanco, mas boniko
			System.out.println ("Tabla del " +a); 
			System.out.println ("***********") ;
			b=1; 
			//primer bucle, cuenta hasta 10 para el titulo "Tabla del..."
			
		while (b <= 10) { 
			//mientras b sea igual o menor 10 se ejecuta
				c= (a*b); //variable que usareos para multiplicador
				System.out.println (a+ " x " +b+ " = " +c );
				//la variable c para que sirva de multiplicador
				b++; //añade +1 a la variable b
			} 
		a++ ; //acumulador +1 a para el titulo

		} 

		} 
}
		
	

	



