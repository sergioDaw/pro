package cap2;

public class eje2_1 {

	public static void main(String[] args) {
		
		int a=230, b=550, c=1001;
		
		if (a>b && b>c)
		{System.out.println("El mayor es " +a +" y el menor es " +c);}
		else 
			{
			if (a>c && c>b){System.out.println("El mayor es " +a +" y el menor es " +b);}
			else
				{
				if (b>a && a>c){System.out.println("El mayor es " +b +" y el menor es " +c);}
				else
					{
					if (b>c && c>a){System.out.println("El mayor es " +b +" y el menor es " +a);}
					else 
						{
						if (c>a && a>b){System.out.println("El mayor es " +c +" y el menor es " +b);}
						else
							{
							if (c>a && b>a){System.out.println("El mayor es " +c +" y el menor es " +a);}
							}
						}
						}
					}
				}
			}

	}


