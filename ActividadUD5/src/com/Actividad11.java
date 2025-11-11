package com;

import java.util.Scanner;

public class Actividad11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] matriz = new int[4][4];
		int el_numero;
		boolean es_igual_filas = false;
		boolean es_igual_colum = false;
		for (int colum = 0; colum < matriz[0].length; colum++) {
			for (int fila = 0; fila < matriz.length; fila++) {
				System.out.println("Fila: " + (colum + 1) + " , Columna: " + (fila + 1));
				matriz[colum][fila] = sc.nextInt();
			}
		}
		Actividad9.imprimirMatriz(matriz);
		el_numero = sumaFila(matriz, 0);
		System.out.println(el_numero);
		for (int n = 1; n < matriz[0].length; n++) {
			if (sumaFila(matriz, n) == el_numero) {
				es_igual_filas = true;
			} else {
				es_igual_filas = false;
				break;
			}
		}
		System.out.println(es_igual_filas);
		if (es_igual_filas == true) {
			for (int m = 0; m < matriz.length; m++) {
				if (sumaColumna(matriz, m) == el_numero) {
					es_igual_colum = true;
				} else {
					es_igual_colum = false;
					break;
				}
			}
		}

		System.out.println(es_igual_colum);
		if (es_igual_filas == false || es_igual_colum == false) {
			System.out.println("La matriz NO es mágica");
		} else if (es_igual_colum == true && es_igual_filas == true) {
			System.out.println("La martiz ES mágica");
		}
	}

	public static int sumaFila(int[][] m, int fila) {
		int result = 0;

		for (int i = 0; i < m[0].length; i++) {
			result += m[fila][i];
		}

		return result;
	}

	public static int sumaColumna(int[][] m, int columna) {
		int result = 0;

		for (int i = 0; i < m.length; i++) {
			result += m[i][columna];
		}

		return result;
	}
}