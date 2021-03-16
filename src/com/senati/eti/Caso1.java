package com.senati.eti;
import java.util.Scanner;

public class Caso1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese edad: ");
		int edad = a.nextInt();
		
		if (edad >= 18)
				System.out.println("\nMayor de edad");
		else
				System.out.println("\nMenor de edad");

	}

}
