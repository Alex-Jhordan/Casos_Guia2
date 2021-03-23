package com.senati.eti;
import java.util.Scanner;

public class Caso14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		float monto = 0, descuento = 0, total_a_pagar = 0, dolares = 0;
		
		System.out.print("Alumno: ");
		String alumno = a.nextLine();
		System.out.print("Código de carrera [DS, RC, DG]: ");
		String carrera = a.nextLine();
		System.out.print("Código de turno [M, T, N]: ");
		String turno = a.nextLine();
		
		switch (carrera) {
			case "DS":
				carrera = "Desarrollo de Software";
				monto = 1500;
				break;
			case "RC":
				carrera = "Redes y Conectividad";
				monto = 1400;
				break;
			case "DG":
				carrera = "Diseño Grafico";
				monto = 1300;
				break;
			default:
				carrera = "Código no válido";
				monto = 0;
		}
		
		switch (turno) {
		case "M":
			turno = "Mañana";
			descuento = monto * 0.10f;
			break;
		case "T":
			turno = "Tarde";
			descuento = monto * 0.20f;
			break;
		case "N":
			turno = "Noche";
			descuento = monto * 0.15f;
			break;
		default:
			turno = "Código no válido";
			descuento = 0;
		}
		
		total_a_pagar = monto - descuento;
		dolares = total_a_pagar / 3.33f;
		
		System.out.println("\nRESULTADOS");
		System.out.println("----------");
		System.out.println("Carrera: " + carrera);
		System.out.println("Monto: " + monto);
		System.out.println("Turno: " + turno);
		System.out.println("Descuento: " + descuento);
		System.out.println("Total a pagar: " + total_a_pagar);
		System.out.println("Total a pagar en dólares: " + dolares + "$");
			
	}

}
