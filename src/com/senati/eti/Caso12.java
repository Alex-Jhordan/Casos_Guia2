package com.senati.eti;
import java.util.Scanner;

public class Caso12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Empleado: ");
		String empleado = a.nextLine();
		
		System.out.print("Nivel [1-4] ");
		int nivel = a.nextInt();
		
		System.out.print("Sueldo: ");
		float sueldo = a.nextFloat();
		
		float incremento = 0;
		
		switch (nivel) {
			case 1:
				incremento = 0.045f;
				break;
			case 2:
				incremento = 0.06f;
				break;
			case 3:
				incremento = 0.085f;
				break;
			case 4:
				incremento = 0.11f;
				break;
			default:
				incremento = 0;
		
		}
		
		float nuevo_sueldo = (sueldo + sueldo * incremento);
		
		System.out.println("Incremento: " + (incremento * 100) + "%");
		System.out.println("Nuevo sueldo: " + nuevo_sueldo);
	}

}
