package com;

import java.util.Scanner;

public class do_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int opcion;
		
		do {
			System.out.println("1) Saludar  2) Despedir  0) Salir");
			opcion = sc.nextInt();
			
			switch (opcion) {
			case 1: System.out.println("Hola");
			case 2: System.out.println("Adios");
			case 0: System.out.println("Saliedo");
			default: System.out.println("Eso no es una opcion");
				
			
	
			}
		}
	}
}
