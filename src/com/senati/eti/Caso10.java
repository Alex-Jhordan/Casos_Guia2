package com.senati.eti;
import java.util.Scanner;

public class Caso10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.println("Resultados");
		
		System.out.print("Trabajador: ");
		String trabajador = a.nextLine();
		
		System.out.print("Horas trabajadas: ");
		float horas_trabajadas = a.nextInt();
		
		System.out.print("Tarifa por horas: ");
		float tarifa_por_hora = a.nextInt();
		
		System.out.print("Minutos de tardanza: ");
		int tardanza = a.nextInt();
		
		float importe = horas_trabajadas * tarifa_por_hora;
		float bono = 0,	descuento = 0;
		
		if (horas_trabajadas > 60)
			bono = importe * 0.13f;
		else
			bono = importe * 0.04f;
		
		if (tardanza > 15)
			descuento = importe * 0.03f;
		else
			descuento = 0;
		
		float meta = (horas_trabajadas * 100) / 70; 
		
		
		System.out.println("Importe: " + importe);
		System.out.println("Bono: " + bono);
		System.out.println("Descuento: " + descuento);
		System.out.println("Meta alcanzada: " + meta + "%");

	}

}
