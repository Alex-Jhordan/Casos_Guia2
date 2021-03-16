package com.senati.eti;
import java.util.Scanner;

public class Caso3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese primer número: ");
		int numero1 = a.nextInt();
		
		System.out.print("Ingrese segundo número: ");
		int numero2 = a.nextInt();
		
		String mensaje = "";
		
		if (numero1 > numero2) 
			mensaje = "El primer número es mayor";
		
		else if (numero2 > numero1)
			mensaje = "El segundo número es mayor";
		else 
			mensaje = "Los números son iguales";
		
		System.out.println("Resultado");
		System.out.println(mensaje);
	}

}
