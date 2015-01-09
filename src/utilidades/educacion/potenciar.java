package utilidades.educacion;

public class potenciar {


int potencia(int a, int b){
	 
	int resultado = 1;
	//inicilizamos la variable...
	
	int i = b;
	while (i>0) {
	resultado*=a;
	i--;
	//bucle para calcular la potencia
	}
	return resultado;
	}
	
}

/*podriamos usar la funcion Math con:
 * 
 
	int potencia (int a, int b)
	
		int a = num1;
		int b = num2;
	
		int resultado = 0;
		
		resultado = Math.pow(num1, num2);
		
		return resultado;
		
*/