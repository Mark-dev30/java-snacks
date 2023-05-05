package org.snack.java;

public class Snack7 {
	public static void main(String[] args) {
		boolean val = true;
		for(int i=0;val;i++) {
			int casualNumber = (int)(Math.random() * 100 + 1);
			System.out.println(casualNumber);
			if(casualNumber%3 == 0 && casualNumber%5 == 0) {
				System.out.println("Trovato il numero " + casualNumber);
				val = false;
			}
		}
		
	}
}
