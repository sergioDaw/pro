package cap4;

import java.util.Scanner;

public class eje4_2 {
			
//método, calculo la serie fibonacci
		 private int calculo(int n)
		   {
		      int num1, num2, resultado = 0;

		      if (n == 1 || n == 2)
		         return n - 1;

		      num2 = 0;
		      num1 = 1;
		      
		      	for (int i = 2; i < n; i++) {
		    	  
		    	 resultado = num1 +  num2;
		         num2 = num1;
		         num1 = resultado;
		      }

		      return resultado;
		   } 
	 
//metodo, número que se calcularan en la serie 
			public void serie(int n)
			
			   {
			      for (int i = 1; i <= n; ++i)
			         System.out.print(calculo(i) + "" + ",");
			   } 
//main	 
		 public static void main(String[] args)
		   {
		      Scanner keyboard = new Scanner(System.in);
		      int cantidad;

		      System.out.print("Introduce cantidad de números fibonacci que quieres calcular");
		      cantidad = keyboard.nextInt();
		      
		      eje4_2 obj1 = new eje4_2();
		      obj1.serie(cantidad);
		      //se implementa el método serie para este objeto partiendo de la cifra introducida.
		   }
	}