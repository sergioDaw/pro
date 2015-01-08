package cap3;

import java.util.Scanner;

import java.text.DecimalFormat;  
	//para limitar los decimales a 2
	// http://buenasintencions.blogspot.com.es/2013/02/limitar-el-numero-de-decimales.html


public class finanzas {

	private Scanner keyboard;
	private double dolarEuros;
	private double eurosDolar;
	private double dolares;
	private double euros;
	
	DecimalFormat decimales = new DecimalFormat("0.00");
	//nuevo objeto de la utilidad DecimalFormat, dento de las () fijamos el formato
	
	public void Inicializar() {
        keyboard=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de dolares a convertir: ");
        dolares=keyboard.nextDouble();
        
        keyboard=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de euros a convertir: ");
        euros=keyboard.nextDouble();
        
        //este metodo para introducir los datos a convertir
    }
	public void dolarEuros() {
		dolarEuros= dolares * 1.36;
	// conversor de dolares a euros
	}
	
	public void eurosDolar() {
		double valorCambio;
		
		keyboard=new Scanner(System.in);
        System.out.print("Ingrese el valor de cambio: ");
        valorCambio=keyboard.nextDouble();
        
		eurosDolar= euros / valorCambio;
		
	// conversor euros a dolares, podemos fijar el valor con la nueva varible valorCambio
	}
	
	public void imprimirDolares() {
         {
            System.out.println(+euros +" euros son " +decimales.format(dolarEuros) +" $");
        }
    }
	
	public void imprimirEuros() {
        {
           System.out.println(+dolares +" dolares son " +decimales.format(eurosDolar) +" €");
       }
   }
	//esto es para mostrar los datos... supongo que podriamos hacerlo de otra manera
	// con return o añadirlo dentro de los otros métodos?
	
	
	public static void main(String[] ar) {
		
        finanzas kk=new finanzas();
        kk.Inicializar();
        kk.dolarEuros();
        kk.eurosDolar();
        kk.imprimirDolares();
        kk.imprimirEuros();
        }

}