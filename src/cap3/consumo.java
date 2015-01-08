package cap3;
import java.text.DecimalFormat;
import java.util.Scanner;

	/**
	 *Implementa una clase consumo, la cual forma parte de una centralita telefónica de
	un coche y tiene las siguientes características:
	
		 ATRIBUTOS:
	Kms. Kilómetros recorridos por el coche.
	litros. Litros de combustible consumido.
	vmed. Velocidad media.
	Pgas. Precio de la gasolina.
	
 		MÉTODOS:
	getTiempo. Indicará el tiempo empleado en realizar el viaje.
	consumoMedio. Consumo medio del vehículo (en litros cada 100 Km.)
	consumoEuros. Consumo medio del vehículo (en euros cada 100 Km.)
	
	setKms. Modifica el valor del atributo kms
	setLitros.- Modifica el valor del atributo litros
	setVmed. Modifica el valor del atributo vmed
	setPGas. Modifica el valor del atributo pgas
	
	Debes crear un constructor para la clase que establezca el valor de los atributos. Elige el
	tipo de datos más apropiado para cada atributo
	 */

public class consumo {

	private Scanner keyboard;
	DecimalFormat decimales = new DecimalFormat("0.0");

	//atributos propuestos
	private double Kms, litros, vmed, Pgas;
	
	//constructor
	consumo() {
		Kms = 100;
		litros = 12;
		vmed = 100;
		Pgas = 1.3;
	}
	
	//métodos
	
	public void getTiempo() {
		double duracion;
		duracion = Kms / vmed;
		//variable que opera y calcula el tiempo
		System.out.println("La duración del viaje es " +decimales.format(duracion) +" horas");
        }
	
	public void consumoMedio() {
		double consumoM;
		consumoM = (litros * 100)/Kms;
		System.out.println("Consumo medio  " +decimales.format(consumoM) +" litros");
		}
	
	public void consumoEuros() {
		double consumoE;
		consumoE = ((litros * 100)/Kms) *Pgas;
		System.out.println("Consumo medio en Euros " +decimales.format(consumoE) +" €");
		}
	
	public void setKms() {
		keyboard=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de kilometros recorridos: ");
        Kms=keyboard.nextInt();
	}
	
	public void setLitros() {
		keyboard=new Scanner(System.in);
        System.out.print("Ingrese la cantidad de litros gastados: ");
        litros=keyboard.nextInt();
	}
	
	public void setVmed() {
		keyboard=new Scanner(System.in);
        System.out.print("Ingrese la velocidad media: ");
        vmed=keyboard.nextInt();
	}
	
	public void setPgas() {
		keyboard=new Scanner(System.in);
        System.out.print("Ingrese el precio de la gasolina: ");
        Pgas=keyboard.nextInt();
	}
	
public static void main(String[] ar) {
		
		consumo x;
		x = new consumo();
		x.getTiempo();
		x.consumoMedio();
		x.consumoEuros();
       
		consumo z;
		z = new consumo();
		z.setKms();
		z.setLitros();
		z.setVmed();
		z.setPgas();
		z.getTiempo();
		z.consumoMedio();
		z.consumoEuros();
		
        }
}
