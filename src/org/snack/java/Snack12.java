package org.snack.java;

import java.util.Arrays;

public class Snack12 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		
		int arrLeng = arr1.length + arr2.length;
		Integer[] arr3 = new Integer[arrLeng];
		
		
		
		int i = 0;
		while(i<arr1.length) {
			arr3[i]=arr1[i];
			i++;
		}
		int j=0;
		while(i<arrLeng) {
			arr3[i]=arr2[j];
			i++;
			j++;
		}
		System.out.println(Arrays.asList(arr3));
		
	}
}
