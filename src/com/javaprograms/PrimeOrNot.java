package com.javaprograms;

public class PrimeOrNot {
	
	public static void main(String[] args) {
		int number = 150;
		boolean  isPrime =true;
		for(int i =2; i<number/2;i++) {
			if(number%i == 0 ) {
				isPrime =false;
				break;
			}
		}
		System.out.println("is given number is prime : " + isPrime);
	}

}
