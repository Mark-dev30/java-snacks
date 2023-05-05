package org.snack.java;

import java.util.Arrays;

public class Snack13 {
	public static void main(String[] args) {
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Integer[] arr2 = { 34, 35, 36, 37, 38 };
		int arr1Len = arr1.length;
		int arr2Len = arr2.length;
		Integer[] newarr1 = new Integer[arr1Len];
		Integer[] newarr2 = new Integer[arr2Len];
		
		int i = 0;
		while(i<arr1Len) {
			if (i==0) {
				newarr1[i] = arr2[i];
				i++;
			}
			else {
				newarr1[i] = arr1[i];
				i++;
			}
		}
		i = 0;
		while(i<arr2Len) {
			if (i==0) {
				newarr2[i] = arr1[i];
				i++;
			}
			else {
				newarr2[i] = arr2[i];
				i++;
			}
		}
		
		System.out.println(Arrays.asList(newarr1));
		System.out.println(Arrays.asList(newarr2));
		
	}
}
