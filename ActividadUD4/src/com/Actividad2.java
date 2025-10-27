package com;

public class Actividad2 {

	public static void main(String[] args) {
		intervalo(1, 20);

	}

	public static void intervalo(int num1, int num2) {
		int num3;
		if (num1 > num2) {
			num3 = num2;
			while (num3 <= num1) {
				System.out.println(num3);
				num3++;
			}

		} else {
			num3 = num1;
			while (num3 <= num2) {
				System.out.println(num3);
				num3++;
			}
		}
	}
}
