package com.senati.eti;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese primer n�mero: ");
		int numero1 = a.nextInt();
		
		System.out.print("Ingrese segundo n�mero: ");
		int numero2 = a.nextInt();
		
		String mensaje = "";
		
		if (numero1 > numero2) 
			mensaje = "El primer n�mero es mayor";
		
		else if (numero2 > numero1)
			mensaje = "El segundo n�mero es mayor";
		else 
			mensaje = "Los n�meros son iguales";
		
		System.out.println("Resultado");
		System.out.println(mensaje);
	}

}
