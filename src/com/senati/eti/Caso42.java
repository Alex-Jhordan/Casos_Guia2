package com.senati.eti;
import java.util.Scanner;

public class Caso42 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese primer número: ");
		int numero1 = a.nextInt();
		
		System.out.print("Ingrese segundo número: ");
		int numero2 = a.nextInt();
		
		System.out.print("Ingrese tercer número: ");
		int numero3 = a.nextInt();
		
		String mensaje = "";
		
		if (numero1 != numero2 && numero1 != numero3 && numero2 != numero3)
		
			if (numero1 < numero2 && numero1 < numero3)
				mensaje = "El primer número es menor";
			else if (numero2 < numero1 && numero2 < numero3)
				mensaje = "El segundo número es menor";
			else 
				mensaje = "El tercer número es menor";
		
		else if (numero1 == numero2 && numero3 > numero1)
			mensaje = "El primer y segundo número son iguales y menores al tercer número";
			else if (numero1 == numero2 && numero3 < numero1)
				mensaje = "El tercer número es menor";
		
		else if (numero2 == numero3 && numero1 > numero2 )
			mensaje = "El segundo y tercer número son iguales y menores al primer número";
			else if (numero2 == numero3 && numero1 < numero2 )
				mensaje = "El primer número es menor";
		
		else if (numero1 == numero3 && numero2 > numero3)
			mensaje = "El primer y tercer número son iguales y menores al segundo número";
			else if (numero1 == numero3 && numero2 < numero3)
				mensaje = "El segundo número es menor";
		else
			mensaje = "Los tres números son iguales";
		
		System.out.println("Resultado");
		System.out.println(mensaje);
	}

}
