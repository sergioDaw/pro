package cap1;

public class eje1_8 {


	public static void main(String[] args) {
		
		int resultado;
		char letra;
		resultado=(int)(Math.random()*26+65); //Sumamos al numero de letras (sin �) el valor en ASCII
		letra = (char)resultado; //la variable letra ahora tiene como valor el "casting" de la variable resultado, 
		//es decir que hemos transformado de tipo int a char resultado. 
		
		System.out.println(letra);
		if ((letra=='A') || (letra=='E') || (letra=='I') || (letra=='O') || (letra=='U'))
		{System.out.println("La letra " +letra +" es una vocal");
			}
		else {System.out.println("La letra " +letra +" es una consonante");}
	}

}
