package com.javaprograms;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		System.out.print("0, 1,");
		calculateFibonacci(0, 1,3);
	}
	
	/**
	 * 
	 * @param first
	 * @param second
	 * @param count - how many numbers to be displayedd
	 */
	public static void calculateFibonacci(int first , int second,int count) {
		
		if(count <20) {
		int third = first+second;
		System.out.print(third + ", ");
		calculateFibonacci(second, third,count+1);
		}
		
		
	}

}
