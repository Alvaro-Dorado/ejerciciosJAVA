package com;

import java.util.Scanner;

public class Actividad9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		System.out.println("Introduce el numero a comprobar");
		num = sc.nextInt();

		divisores(num);

		sc.close();
	}

	public static void divisores(int numero) {
		for (int i = 2; i < numero; i++) {
			if (numero % i == 0) {
				boolean es_primo = Actividad7.primo(i);

				if (es_primo) {
					System.out.println(i);
				}

			}
		}
	}
}
