package com;

import java.util.Scanner;

public class tablamultiwhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, aux;
		int i = 0;
		System.out.println("Introduzca un numero");
		num = sc.nextInt();

		while (i <= 9) {
			i++;
			aux = num * i;
			System.out.println(num + " x " + i + " = " + aux);
		}
	}
}
