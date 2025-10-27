package com;

public class Actividad8 {

	public static void main(String[] args) {
		System.out.println(div_primo(6));
		System.out.println(div_primo(8));
		System.out.println(div_primo(2));
		System.out.println(div_primo(4));
		System.out.println(div_primo(10));
	}

	public static int div_primo(int num) {
		int contador = 0;
		for (int i = 2; i < num; i++) {
			if (Actividad7.primo(i) && num % i == 0) {
				contador++;
			}
		}
		return contador;
	}
}
