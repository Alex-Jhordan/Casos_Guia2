package com.senati.eti;
import java.util.Scanner;

public class Caso7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese sueldo: ");
		int sueldo = a.nextInt();
		
		float impuesto;
		
		if (sueldo <= 1500)
			impuesto = sueldo * 0.03f;
		else if (1500 < sueldo && sueldo <= 3000)
			impuesto = sueldo * 0.08f;
		else
			impuesto = sueldo * 0.12f;
		
		System.out.println("Impuesto calculado: " + impuesto);
		System.out.println("Sueldo neto: " + (sueldo - impuesto));
	}

}
