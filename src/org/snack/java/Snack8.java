package org.snack.java;

import java.util.Arrays;

public class Snack8 {
	public static void main(String[] args) {
		Integer[] even = new Integer [8];
		Integer[] odd = new Integer [8];
		int val1 = 0;
		int val2 = 0;
		for (int i=0; i<10; i++) {
			int casualNumber = (int)(Math.random() * 100 + 1);
			
			if(casualNumber % 2 == 0) {
				even[val1++] = casualNumber;
				
			}
			else {
				odd[val2++] = casualNumber;
				
			}
		}
		System.out.println("I numeri pari random sono: " + Arrays.asList(even));
		System.out.println("I numeri dispari random sono: " + Arrays.asList(odd));
	}
}
