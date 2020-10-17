package com.javaprograms;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		int number = 371;
		int originalNumber = number;
		int sum = 0;
		
		while(originalNumber !=0) {
			int remainder = originalNumber%10;
			sum = sum + remainder * remainder * remainder;
			originalNumber =  originalNumber/10;
		}
		if(number == sum) {
			System.out.println(number + " is ArmstrongNumber" );
		}else
			System.out.println(number + " is not ArmstrongNumber" );
	}

}
