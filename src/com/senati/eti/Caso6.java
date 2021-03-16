package com.senati.eti;
import java.util.Scanner;

public class Caso6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo: ");
		int sueldo = a.nextInt();
		float impuesto;
		
		if (sueldo > 2800) {
			impuesto = (sueldo * 5) / 100;
		}
		else {
			impuesto = (sueldo * 2) / 100;
		}
		
		System.out.println("Impuesto calculado: " + impuesto);		
	}
}
