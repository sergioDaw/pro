package cap4;

import java.io.*; 
import java.util.Scanner;  

import java.util.Scanner;

public class temporal {

	public static int elemento (int fila, int columna) {
	    if (fila <1 ||columna < 1) return 0;
	    if (columna == 1) return 1;
	    return   elemento (fila-1, columna) + elemento (fila-1, columna-1) + elemento (fila-1, columna-2);  } 
	     
	 public static void main (String[] args) throws IOException{
	 	int numfilas ;
	 	Scanner teclado=new Scanner(System.in);   
	 	System.out.println ("Introduce la altura de la pirámide: ");   
	 	numfilas = teclado.nextInt();   
	 	for( int i=1; i<( numfilas +1); i++)  {    
	 		for( int e=0; e<( numfilas - i); e++)     
	 		System.out.print ("\t");    
	 	for( int j=1; j<(2* numfilas +1); j++) {     
	 		int dato = elemento(i, j);     
	 		if (dato > 0)      
	 			System.out.print (dato+ "\t" );    
	 			}
	 	System.out.println (" ");   }  } 
	
	
}

/*
 */
