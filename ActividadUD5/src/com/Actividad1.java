package com;

import java.util.Scanner;

public class Actividad1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double[] num = new double[5];
		for (int i = 0; i < 5; i++) {
			System.out.println("Introduzca los numeros");
			num[i] = sc.nextDouble();		
		}
		for (double num1: num) {
			System.out.println(num1);
		}
	}
}
