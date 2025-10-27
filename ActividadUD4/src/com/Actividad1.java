package com;

public class Actividad1 {

	public static void main(String[] args) {
		eco(3);

	}

	public static void eco(int veces) {
		while (veces > 0) {
			System.out.println("eco...");
			veces--;
		}
	}
}