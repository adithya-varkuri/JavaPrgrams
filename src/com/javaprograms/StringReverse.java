package com.javaprograms;

public class StringReverse {
	public static void main(String[] args) {
		String name ="adithya";
		
		//1
		StringBuffer nameBuffer = new StringBuffer(name);
		 name = nameBuffer.reverse().toString();
		System.out.println(name);
		
		
		//2
		String name2 = "varkuri";
		byte[] nameArray = name2.getBytes();
		byte[] reverseNameArray = new byte[nameArray.length];
		for(int i = 0 ; i< nameArray.length ; i++) {
			reverseNameArray[i] = nameArray[nameArray.length-1-i];
		}
		String reverseName = new String(reverseNameArray);
		System.out.println(reverseName);
		
		
	}

}
