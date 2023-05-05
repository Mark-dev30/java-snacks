package org.snack.java;

import java.util.Scanner;

public class Snack {
	public static void main(String[] args) {
		// Snack 1
		Scanner in = new Scanner(System.in);
		System.out.println("Inserisci un numero");
		int num = in.nextInt();
		in.close();
		System.out.println(
				num %2 == 0
				? num
				: num + 1
				);
		//ELSE
//		if(num % 2 == 0) {
//			System.out.println(num);
//		}
//		else {
//			System.out.println(num+1);
//		}
	}
}
