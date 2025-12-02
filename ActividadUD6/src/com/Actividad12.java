package com;

import java.util.Arrays;

public class Actividad12 {
	public static void main(String[] args) {
		if (sonAnagrama("amor", "Mora")) {
			System.out.println("Son anagramas");
		} else {
			System.out.println("No son anagramas");
		}
	}

	public static boolean sonAnagrama(String palabra1, String palabra2) {
		if (palabra1.length() != palabra2.length())
			return false;
		char[] tablaPalabra1 = palabra1.toLowerCase().toCharArray();
		char[] tablaPalabra2 = palabra2.toLowerCase().toCharArray();
		Arrays.sort(tablaPalabra1);
		Arrays.sort(tablaPalabra2);
		for (int i = 0; i < tablaPalabra1.length; i++) {
			if (tablaPalabra1[i] != tablaPalabra2[i]) {
				return false;
			}
		}
		return true;
	}
}