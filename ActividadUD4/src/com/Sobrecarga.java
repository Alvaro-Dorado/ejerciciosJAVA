package com;

import java.util.Scanner;

public class Sobrecarga {

	public static void main(String[] args) {

	}

	public static void mostrar(String mensaje) {
		System.out.println(mensaje);

	}

	public static void mostrar(int numero) {
		if (numero % 2 == 0) {
			System.out.println("El numero " + numero + " es par");
		} else {
			System.out.println("El numero " + numero + " es impar");
		}
	}

	public static void mostrar(String texto, int veces) {
		int numero;
		numero = 1;
		while (numero < veces) {
			numero++;
			System.out.println(texto);
		}
	}

}
