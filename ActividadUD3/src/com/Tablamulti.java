package com;

import java.util.Scanner;

public class Tablamulti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, aux;

		System.out.println("Introduzca un numero");
		num = sc.nextInt();

		for (int i = 0; i <= 10; i = i + 1) {
		aux= num*i;
			System.out.println(num + " x " + i + " = " + aux);
		}

	}

}
