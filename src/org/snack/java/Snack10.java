package org.snack.java;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Snack10 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		DecimalFormat dc = new DecimalFormat("0.00");
		System.out.println("Inserisci raggio");
		int radius = in.nextInt();
		in.close();
		double area = (radius * radius) * 3.14;
		double perimeter = (2 * radius) * 3.14;
		System.out.println("L'area del cerchio è " + area);
		System.out.println("Il perimetro del cerchio è " + dc.format(perimeter));
	}
}
