package com;

import java.util.Scanner;

public class Actividad12 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero, valorabsoluto;

		System.out.println("Indique un numero:");
		numero = sc.nextInt();

		valorabsoluto = Math.abs(numero);
		System.out.println(valorabsoluto);
	}

}
