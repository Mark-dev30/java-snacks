package org.snack.java;

import java.util.Arrays;
import java.util.Scanner;

public class Snack5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int val = in.nextInt();
		in.close();
		int summ = 0;
		int sumEven = 0;
		int sumShot = 0;
		int countShot = 0;
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		Integer[] numRandom = new Integer[val];

		;
		for(int i = 0; i<val; i++) {
			int casualNumber = (int)(Math.random() * 100 + 1);
			numRandom[i] = casualNumber;
			
			summ += casualNumber;
			if(casualNumber % 2 == 0) {
				sumEven += casualNumber;
			}
			else {
				countShot++;
				sumShot += casualNumber;
				;
			}
			if (casualNumber < min) {
				min = casualNumber;
			}
			if (casualNumber > max) {
				max = casualNumber;
			}
		}
		System.out.println("I numeri scelti random sono: " + Arrays.asList(numRandom));
		System.out.println("La somma dei numeri è: " + summ);
		System.out.println("La media dei numeri è: " + summ / val);
		System.out.println("La somma dei numeri pari è: " + sumEven);
		System.out.println("La media dei numeri dispari è: " + sumShot / countShot);
		System.out.println("Il numero min è: " + min);
		
	}
}
