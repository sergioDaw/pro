package cap3;

/**
 *
 	En un restaurante mejicano cuya especialidad son las papas con chocos nos piden
	diseñar un método con el que se pueda saber cuántos clientes pueden atender con la materia
	prima que tienen en el almacén. El método recibe la cantidad de papas y chocos en kilos y
	devuelve el número de clientes que puede atender el restaurante teniendo en cuenta que por
	cada tres personas, utiliza 1 kilo de papas y medio de chocos.
	
	Implementa también los siguientes métodos:
		· public void addChocos(int x). Añade x kilos de chocos a los ya existentes.
		· public void addPapas(int x). Añade x kilos de papas a los ya existentes.
		· public int getComensales( ). Devuelve el nº de comensales que puede atender.
		· public void showChocos( ). Muestra en pantalla los kilos de chocos del almacén.
		· public void showPapas( ). Muestra en pantalla los kilos de papas del almacén.
 */
import java.util.Scanner;

public class restaurante {
	
	//Los Pollos Hermanos
	private Scanner keyboard;
	
	double cantidadPapas;
	double cantidadChocos;
	//cantidad de cada producto, en kilos
	
	int clientes;
	
	restaurante (double a, double b) {a = cantidadPapas; b = cantidadChocos;}
	
	public void addPapas(int x){
		
		//System.out.print("Ingrese la cantidad de Papas ");
        //x=keyboard.nextInt();
		
		cantidadPapas = cantidadPapas + x;
	}
	
	public void addChocos(int y){
		
		//System.out.print("Ingrese la cantidad de Chocos ");
        //y=keyboard.nextInt();
		
		cantidadChocos = cantidadChocos + y;
	}
	
	
	public int getComensales() {
		 
		System.out.print("Ingrese la cantidad de clientes ");
        clientes=keyboard.nextInt();
        
		double a = cantidadPapas;
		double b = cantidadChocos;
		//
		
		while(cantidadPapas >=1 && cantidadChocos >=0.5)
		{
			clientes = clientes +3;
			cantidadPapas = cantidadPapas - 1;
			cantidadChocos = cantidadChocos - 0.5;}
		
		return clientes;
			}
	
	public void showChocos() {System.out.println("Hay " +cantidadChocos +" en el alamacen");}
	public void showPapas() {System.out.println("Hay " +cantidadPapas +" en el alamacen");}
	
public static void main(String[] ar) {
		
		restaurante r1;
		r1 = new restaurante(50,100);
		// por el constructor??
		
		r1.addPapas(20);
		r1.addChocos(80);
		r1.getComensales();
		r1.showChocos();
		r1.showPapas();
        }
}

//no rula...