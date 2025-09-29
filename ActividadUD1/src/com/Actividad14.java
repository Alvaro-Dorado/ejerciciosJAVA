package com;

import java.util.Scanner;

public class Actividad14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double numero;

		System.out.println("Introduzca un numero decimal");
		numero = sc.nextDouble();

		double calculo = (int) (numero + 0.5);
		System.out.println("El resultado es = " + calculo);
	}

}
