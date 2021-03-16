package com.senati.eti;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		DecimalFormat b = new DecimalFormat("#.00");
		
		System.out.print("Ingrese nombre del alumno: ");
		String nombre = a.nextLine();
		
		System.out.print("Ingrese primera nota: ");
		int n1 = a.nextInt();
		
		System.out.print("Ingrese segunda nota: ");
		int n2 = a.nextInt();
		
		System.out.print("Ingrese número de asistencias [1-12]: ");
		float asistencias = a.nextInt();
		
		String estado = "";
		
		float promedio = (n1 * 0.3f + n2 * 0.7f);
		asistencias = (asistencias * 100) / 12;
		
		if (promedio >= 13 && asistencias >= 70) 
			estado = "Aprobado";
		else
			estado = "Desaprobado";
		
		System.out.println("\nResultados");
		System.out.println("Alumno: " + nombre);
		System.out.println("Promedio: " + promedio);
		System.out.println("Asistencia: " + b.format(asistencias) + "%");
		System.out.println("Estado: " + estado);

	}

}
