package com.senati.eti;
import java.util.Scanner;

public class Caso43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese primer n�mero: ");
		int numero1 = a.nextInt();
		
		System.out.print("Ingrese segundo n�mero: ");
		int numero2 = a.nextInt();
		
		System.out.print("Ingrese tercer n�mero: ");
		int numero3 = a.nextInt();
		
		System.out.print("Ingrese cuarto n�mero: ");
		int numero4 = a.nextInt();
		
		String mensaje = "";
		
		if (numero1 != numero2 && numero1 != numero3 && numero1 != numero4 && numero2 != numero3 && numero2 != numero4 && numero3 != numero4)
		
			if (numero1 < numero2 && numero1 < numero3 && numero1 < numero4)
				mensaje = "El primer n�mero es menor";
			else if (numero2 < numero1 && numero2 < numero3 && numero2 < numero4)
				mensaje = "El segundo n�mero es menor";
			else if (numero3 < numero1 && numero3 < numero2 && numero3 < numero4)
				mensaje = "El tercer n�mero es menor";
			else
				mensaje = "El cuarto n�mero es menor";
		
		else if (numero1 == numero2 && numero3 > numero1)
			mensaje = "El primer y segundo n�mero son iguales y menores al tercer n�mero";
			else if (numero1 == numero2 && numero3 < numero1)
				mensaje = "El tercer n�mero es menor";
		
		else if (numero2 == numero3 && numero1 > numero2 )
			mensaje = "El segundo y tercer n�mero son iguales y menores al primer n�mero";
			else if (numero2 == numero3 && numero1 < numero2 )
				mensaje = "El primer n�mero es menor";
		
		else if (numero1 == numero3 && numero2 > numero3)
			mensaje = "El primer y tercer n�mero son iguales y menores al segundo n�mero";
			else if (numero1 == numero3 && numero2 < numero3)
				mensaje = "El segundo n�mero es menor";
		else
			mensaje = "Los cuatro n�meros son iguales";
		
		System.out.println("Resultado");
		System.out.println(mensaje);
	}

}
