package com.senati.eti;
import java.util.Scanner;

public class Caso4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese primer n�mero: ");
		int numero1 = a.nextInt();
		
		System.out.print("Ingrese segundo n�mero: ");
		int numero2 = a.nextInt();
		
		if (numero1 < numero2) 
			System.out.println("\nEl primer n�mero es menor");
		
		else if (numero2 < numero1)
			System.out.println("\nEl segundo n�mero es menor");
		else 
			System.out.println("\nLos n�meros son iguales");
		
	}

}