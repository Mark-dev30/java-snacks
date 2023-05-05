package org.snack.java;

import java.util.Scanner;

public class Snack6 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero positivo >= a 1000");
		int val = in.nextInt();
		in.close();
		if(val >= 100) {
			int summ = 0;
			for(int i=0; summ < val; i++) {
				int casualNumber = (int)(Math.random() * 100 + 1);
				summ+=casualNumber;
				
				System.out.println(summ);
			}
			
		}
	}
}
