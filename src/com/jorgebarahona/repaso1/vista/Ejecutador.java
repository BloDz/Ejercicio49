package com.jorgebarahona.repaso1.vista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import com.jorgebarahona.repaso1.modelo.Comparador;
import com.jorgebarahona.repaso1.modelo.Facturas;

public class Ejecutador {
	private static boolean correcto = false;
	
	public boolean isCorrecto() {
		return correcto;
	}

	@SuppressWarnings("static-access")
	public void setCorrecto(boolean correcto) {
		this.correcto = correcto;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Facturas> al = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		Facturas f = null;
		
		int idTmp;
		String nombreTmp;
		float importeTmp;
		
		for (int i = 0; i < 3; i++) {
			do {
				System.out.println("Inserte el id del Producto:");
				idTmp = sc.nextInt();
				sc.nextLine();
				System.out.println("Inserte el Nombre del Producto:");
				nombreTmp = sc.nextLine();
				System.out.println("Inserte el Importe del Producto:");
				importeTmp = sc.nextFloat();
				sc.nextLine();
				try {
					f = new Facturas(idTmp, nombreTmp, importeTmp);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}

			} while(correcto==false);
			al.add(f);
		}
		Collections.sort(al, new Comparador());
		mostrar(al);
		
	}
	
	public static void mostrar(ArrayList<Facturas> f) {
		for (Facturas fa : f) {
			fa.mostrar();
		}
	}
}
