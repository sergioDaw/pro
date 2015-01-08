package cap2;

public class eje2_2 {

	public static void main(String[] args) {
		
		
		int i=0;
		bucleext:
			while ( i < 8){
			i++;
				for ( int k = 1; k < (8-i); k+=2) {
					if ( i %2 == 0) { continue bucleext;};
					System.out.print( " " );}
				for ( int j = 0; j < i; j++) {
					System.out.print( "*" );}
					System.out.println( " " );
					if ( i == 7) { break bucleext;};
			}
		
		int y=5;
		bucleext2:
			while ( y > 0){
			y--;
				for ( int c=0; c < (6-y); c+=2) {
					if ( y %2 == 0) { continue bucleext2;};
					System.out.print( " " );}
				for ( int g = 0; g < y; g++) {
					System.out.print( "*" );}
					System.out.println( " " );
					if ( y == 0) { break bucleext2;};
			}
			}
	
	}

//basado en los apuntes :P 
