package org.snack.java;

public class Snack3 {
	public static void main(String[] args) {
		Integer[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		int summ = 0;
		for(int i=0; i<nums.length;i++) {
			if(i % 2 == 0) {
				
			}
			else {
				summ += nums[i];
			}
		}
		System.out.println(summ);
	}
}
