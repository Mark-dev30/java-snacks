package org.snack.java;

import java.util.Scanner;

public class Snack9 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero per la base");
		int base = in.nextInt();
		System.out.println("Inserisci un numero per l'altezza");
		int height = in.nextInt();
		in.close();
		int perimeter = (base * 2) + (height * 2);
		int area = base * height;
		System.out.println("L'area del rettangolo è " + area);
		System.out.println("Il perimetro del rettangolo è " + perimeter);
	}
}
