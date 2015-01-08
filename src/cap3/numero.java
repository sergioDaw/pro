package cap3;

import java.util.Scanner;

public class numero {

	private Scanner keyboard;
	private int num=0;
	
	public void inicio() { 
		keyboard=new Scanner(System.in);
        System.out.print("Ingrese el número a operar: ");
        num=keyboard.nextInt();}
	
	public void sumar() {
		int sumador;
		//variable que guardar la suma
		
        keyboard=new Scanner(System.in);
        System.out.print("Ingrese la cantidad a sumar: ");
        sumador=keyboard.nextInt();
        
        sumador = sumador + num;
        
        System.out.println(sumador +" es el resultado de " +num +" + " +(sumador-num));
        }
	
	public void resta() {
		int restador;
		//variable que guardar la resta
		
        keyboard=new Scanner(System.in);
        System.out.print("Ingrese la cantidad a restar: ");
        restador=keyboard.nextInt();
        
        restador = num - restador;
        
        System.out.println(restador +" es el resultado de " +num +" - " +(num - restador));
        }
	
	public int getValor() {
		return num;
	}
	public void getDouble() {int doble = num*2; System.out.println("El doble de " +num +" es "+doble);}
	
	public void getTriple() {int triple = num*3; System.out.println("El triple de " +num +" es "+triple);}
	
	public void setNumber() { 
		keyboard=new Scanner(System.in);
        System.out.print("Ingrese el nuevo valor: ");
        num=keyboard.nextInt();
        System.out.print("El valor de la varible 'num' es " +num);
        }
	
public static void main(String[] ar) {
		
        numero t=new numero();
        t.inicio();
		t.sumar();
		t.resta();
		t.getValor();
		t.getDouble();
		t.getTriple();
        t.setNumber();
        }
}