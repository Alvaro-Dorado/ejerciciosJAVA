package com;

import java.util.Scanner;

public class Actividad12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[5][5];
		int n, m;
		for (n = 0; n < matriz.length; n++) {
			for (m = 0; m < matriz[0].length; m++) {
				matriz[n][m] = n + m;
			}
		}
		Actividad9.imprimirMatriz(matriz);
	}
}