package com.senati.eti;
import java.util.Scanner;

public class Caso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese un n�mero: ");
		int numero = a.nextInt();
		
		if (numero % 2 == 0)
			System.out.println("El n�mero " + numero + " es par");
		else
			System.out.println("El n�mero " + numero + " es impar");

	}
}
