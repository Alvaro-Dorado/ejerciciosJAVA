package com;

import java.util.Scanner;

public class Actividad4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		do {
			System.out.println("Introduzca un numero");
			num = sc.nextInt();
		} while (num <= 1);
		System.out.println("Eston son los numero del 1 al " + num);
		for (int i = 1; i <= num; i++) {
			System.out.println(i);

		}
	}
}
