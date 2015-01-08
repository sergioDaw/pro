package cap2;

import java.util.Scanner;

public class eje2_5 {

	/**
	 * Realiza un programa que transforme números en formato decimal a números en
formato romano (hasta el número 3999 como máximo).
	 */
	
	public static void main(String[] args) {
	
	Scanner keyboard=new Scanner(System.in);
	
	int num;	
	
	System.out.println ("Introduce un número");
	num=keyboard.nextInt();
	
	String letra="";
	
	while(num>0){
	while (num>=1000){
		num-=1000; letra+="M";}
	//resta y asigna, resta num 1000 y le asigna su nuevo valor
	//suma y asigna, suma a letra la equivalencia , cada pasada se añade a las equivalencias
	
	while (num>=900){
		num-=900; letra+="CM";}
	while (num>=500){
		num-=500; letra+="D";}
	while (num>=400){
		num-=400; letra+="CD";}
	while (num>=100){
		num-=100; letra+="C";}
	while (num>=90){
		num-=90; letra+="XC";}
	while (num>=50){
		num-=50; letra+="L";}
	while (num>=40){
		num-=40; letra+="XL";}
	while (num>=10){
		num-=10; letra+="X";}
	while (num>=9){
		num-=9; letra+="IX";}
	while (num>=5){
		num-=5; letra+="V";}
	while (num>=4){
		num-=4; letra+="IV";}
	while (num>=1){
		num-=1; letra+="I";}
	
	 System.out.println(letra);
	}
	}
}
//Buf! Este es muy complicado, queria hacerlo por case pero no lo he conseguido, al final he mirado en internet como hacerlo, no podia
