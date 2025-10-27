package com;

public class Actividad5 {
	public static void main(String[] args) {
		System.out.println(mayor(5, 8, 2));
	}

	public static int mayor(int a, int b, int c) {
		if (a > b && a > c) {
			return a;
		} else if (b > a && b > c) {
			return b;
		} else
			return c;
	}
}
