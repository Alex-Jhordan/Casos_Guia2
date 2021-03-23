package com.senati.eti;
import java.util.Scanner;

public class Caso15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		float precio = 0, importe = 0, descuento = 0, total_a_pagar = 0;
		String cambio = "";
		
		System.out.print("Cliente: ");
		String cliente = a.nextLine();
		System.out.print("Producto [TB, LT, MN, IM]: ");
		String producto= a.nextLine();
		System.out.print("Cantidad: ");
		int cantidad = a.nextInt();
		
		a.nextLine();
		
		System.out.print("Forma de pago [C1, C2]: ");
		String forma = a.nextLine();
		
		switch (producto) {
			case "TB":
				producto = "Tablet";
				precio = 350;
				break;
			case "LT":
				producto = "Laptop";
				precio = 2300;
				break;
			case "MN":
				producto = "Monitor";
				precio = 850;
				break;
			case "IM":
				producto = "Impresora";
				precio = 680;
				break;
			default:
				producto = "Código no válido";
				precio = 0;
		}
		
		importe = precio * cantidad;
		
		switch (forma) {
			case "C1":
				forma = "Contado";
				cambio = "Descuento: ";
				descuento = importe * 0.05f;
				total_a_pagar = importe - descuento;
				break;
				
			case "C2":
				forma = "Crédito";
				cambio = "Incremento: ";
				descuento = importe * 0.12f;
				total_a_pagar = importe + descuento;
				break;
		}
		
		System.out.println("RESULTADOS");
		System.out.println("----------");
		System.out.println("Cliente " + cliente);
		System.out.println("Producto: " + producto);
		System.out.println("Precio: " + precio);
		System.out.println("Cantidad: " + cantidad);
		System.out.println("Importe: " + importe);
		System.out.println("Forma de pago: " + forma);
		System.out.println(cambio + descuento);
		System.out.println("Total a pagar: " + total_a_pagar);
		

	}

}
