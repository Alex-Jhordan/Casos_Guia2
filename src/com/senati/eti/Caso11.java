package com.senati.eti;

import java.util.Scanner;

public class Caso11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese número [1-7] ");
		int nd = a.nextInt();
		
		String nombre_dia = "";
		
		switch (nd) {
			case 1:
				nombre_dia = "Lunes";
				break;
			case 2:
				nombre_dia = "Martes";
				break;
			case 3:
				nombre_dia = "Miércoles";
				break;
			case 4:
				nombre_dia = "Jueves";
				break;
			case 5:
				nombre_dia = "Viernes";
				break;
			case 6:
				nombre_dia = "Sábado";
				break;
			case 7:
				nombre_dia = "Domingo";
				break;
			default:
				nombre_dia = "Día desconocido";
		}
		
		System.out.println("Resultado");
		System.out.println("Día de la semana: " + nombre_dia);
	}

}
