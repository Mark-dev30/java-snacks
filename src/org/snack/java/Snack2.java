package org.snack.java;

import java.util.Random;

public class Snack2 {
	public static void main(String[] args) {
		String[] names = {"Carmela", "Pippo", "Pluto", "Paperino"};
		String[] lastnames = {"Sanpietro", "Solare", "Panchi", "Catri"};
		Random random = new Random();
		for(int i=0; i<=names.length; i++) {
			int casualNum1 = random.nextInt(names.length);
			int casualNum2 = random.nextInt(lastnames.length);
			System.out.println(names[casualNum1] + " " + lastnames[casualNum2]);
		}

	}
}
