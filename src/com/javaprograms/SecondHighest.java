package com.javaprograms;

public class SecondHighest {
	
	public static void main(String[] args) {
		int[] numbers =  new int[] {1,234,3,3423,52,62134,4127,90};
		int secondHighest =numbers[0];
		int firstHighest = numbers[0];
		for(int i =1 ; i<numbers.length ; i++) {
			if(numbers[i] > firstHighest) {
				secondHighest = firstHighest;
				firstHighest = numbers[i];
			}else {
				if(numbers[i]>secondHighest) {
					secondHighest =numbers[i];
				}
			}
			
			
		}
		System.out.println("second highest is : " +secondHighest);
	}

}
