package com;

import java.util.Scanner;

public class Actividad7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		boolean primo_bool;
		System.out.println("Introduce 1 numero para saber si es primo o no");
		num = sc.nextInt();
		primo_bool = primo(num);
		if (primo_bool == true) {
			System.out.println("El numero es primo");
		} else {
			System.err.println("El numero no es primo");
		}

	}

	public static boolean primo(int num) {
		boolean es_primo = true;
		for (int divisor = 2; divisor <= Math.sqrt(num); divisor++) {
			if ((num % divisor) == 0) {
				es_primo = false;
				break;
			}
		}
		return es_primo;
	}
}