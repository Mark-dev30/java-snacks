package org.snack.java;

import java.util.Scanner;

public class Snack4 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci una parola");
		String val = in.nextLine();
		in.close();
		String word = val.toLowerCase();
		String reverseWord = "";
		for (int i = (word.length() - 1); i >=0; --i) {
		      reverseWord = reverseWord + word.charAt(i);
		    }
		if(word.equals(reverseWord)) {
			System.out.println("La parola è palindroma");
		}
		else {
			System.out.println("La parola non è palindroma");
		}
		
	}
}
