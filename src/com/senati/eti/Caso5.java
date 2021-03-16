package com.senati.eti;
import java.util.Scanner;

public class Caso5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner(System.in);
		
		System.out.print("Ingrese precio: ");
		float precio = a.nextFloat(); 
		
		System.out.print("Ingrese cantidad: ");
		int cantidad = a.nextInt(); 
		
		float total = cantidad * precio;
		float descuento = 0;
		
		System.out.println("Total: " + total);
		
		if (cantidad > 8)
			descuento = (total * 10) / 100;
		else
			descuento = 0;

		float neto = total - descuento;
		
		System.out.println("Descuento: " + descuento);
		System.out.println("Neto: " + neto);
		
	}

}
