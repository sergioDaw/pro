package cap1;

public class eje1_12 {

	public static void main(String[] args) {
		// dividir entre 500, 200, 100 y despues fijar el valor de dinero con el resto % de cada billete

		int dinero = 732, b_500, b_200, b_100, b_50, b_20, b_10, b_5;
		
		b_500=dinero/500;
		dinero=dinero%500;
		
		b_200=dinero/200;
		dinero=dinero%200;
		
		b_100=dinero/100;
		dinero=dinero%100;
		
		b_50=dinero/50;
		dinero=dinero%50;
		
		b_20=dinero/20;
		dinero=dinero%20;
		
		b_10=dinero/10;
		dinero=dinero%10;
		
		b_5=dinero/5;
		dinero=dinero%5;
		
		System.out.println("Hay " +b_500 +" billete/s de 500" );
		System.out.println("Hay " +b_200 +" billete/s de 200" );
		System.out.println("Hay " +b_100 +" billete/s de 100" );
		System.out.println("Hay " +b_50 +" billete/s de 50" );
		System.out.println("Hay " +b_20 +" billete/s de 20" );
		System.out.println("Hay " +b_10 +" billete/s de 10" );
		System.out.println("Hay " +b_5 +" billete/s de 5" );
		System.out.println("Hay " +dinero +" monedas de euro" );

//creo que se podr�a hacer de otra manera, con condicionales...
	}

}
