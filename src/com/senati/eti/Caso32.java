package com.senati.eti;
import java.util.Scanner;

public class Caso32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese primer n�mero: ");
		int numero1 = a.nextInt();
		
		System.out.print("Ingrese segundo n�mero: ");
		int numero2 = a.nextInt();
		
		System.out.print("Ingrese tercer n�mero: ");
		int numero3 = a.nextInt();
		
		String mensaje = "";
		
		if (numero1 == numero2 && numero1 == numero3) 
			mensaje = "Los tres n�meros son iguales";
		
		else if (numero1 > numero2 && numero1 > numero3)
			mensaje = "El primer n�mero es mayor";
		
		else if (numero2 > numero1 && numero2 > numero3)
			mensaje = "El segundo n�mero es mayor";
		else 
			mensaje = "El tercer n�mero es mayor";
		
		System.out.println("Resultado");
		System.out.println(mensaje);
	}

}