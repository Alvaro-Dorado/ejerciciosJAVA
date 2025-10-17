package com;

public class Actividad11 {
	public static void main(String[] args) {
		int num1 = 1, num2 = 1, aux;
		while (num2 <= 10) {
			aux = num1 * num2;
			System.out.println(num1 + " x " + num2 + " = " + aux);
			if (num1 < 10) {
				num1++;
			} else {
				num1 = 1;
				num2++;
			}
		}
	}
}
