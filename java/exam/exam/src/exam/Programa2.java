package exam;

import java.util.Scanner;

public class Programa2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1, num2=20, num3; 
		
		Scanner Entrada= new Scanner (System.in);
		System.out.println("Digite um número maior qualquer");
		num1=Entrada.nextInt(); 
		num2+=num1; 
		System.out.println("O valor do segundo número é "+num2);
		if((num1%2)==0) {
			num3= num1*4; 
		} else if((num2%3)==0) {
			num3= num2+2*num1; 
		} else {
			num3=num2;
		}
		System.out.println("O valor do terceiro número é "+num3); 
	}

}
