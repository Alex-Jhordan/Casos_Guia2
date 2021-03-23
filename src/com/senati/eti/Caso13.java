package com.senati.eti;
import java.util.Scanner;

public class Caso13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		float resultado = 0;
		String operacion = "";
		
		System.out.print("Primer número: ");
		float num1 = a.nextFloat();
		System.out.print("Segundo número: ");
		float num2 = a.nextFloat();
		System.out.print("Operación [1-6]: ");
		int opc = a.nextInt();
		
		switch (opc) {
			case 1:
				operacion = "Suma";
				resultado = num1 + num2;
				break;
			case 2:
				operacion = "Resta";
				resultado = num1 - num2;
				break;
			case 3:
				operacion = "Producto";
				resultado = num1 * num2;
				break;
			case 4:
				operacion = "División";
				if (num2 != 0.0f)
					resultado = num1 / num2;
				else {
					operacion = "No es posible dividir entre cero";
					resultado = 0.0f;
				}
				break;
			case 5:
				operacion = "Resto entero";
				if (num2 != 0.0f)
					resultado = num1 % num2;
				else {
					operacion = "No es posible hallar el resto entero";
					resultado = 0.0f;
				}
				break;
			case 6:
				operacion = "Promedio";
				resultado = (num1 + num2) / 2;
				break;
			default:
				operacion = "Operación no válida";
				resultado = 0;
		}
		
		System.out.println("------------------");
		System.out.println("----Resultados----");
		System.out.println("------------------");
		
		System.out.println("Número 1: " + num1);
		System.out.println("Número 2: " + num2);
		System.out.println("Operación: " + operacion);
		System.out.println("Resultado: " + resultado);
	}

}
