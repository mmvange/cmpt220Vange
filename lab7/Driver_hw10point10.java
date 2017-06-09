/** 
File: Driver_hw10point10.java
Author: Mary Vange
Course: CMPT 220
Assignment: Lab 7
Version: 1.2

**/

import java.math.BigInteger; 

public class Driver_hw10point10 {
	public static void main(String[] args) {
		BigInteger i = new BigInteger(Long.MAX_VALUE + ""); // Find the first 10 square numbers that are > than Long.MAX_VALUE
		BigInteger end = i.add(new BigInteger("10")); //this is the 10 

		for (i = new BigInteger(Long.MAX_VALUE + ""); //for loop to display 
			i.compareTo(end) <= 0; 
			i = i.add(new BigInteger("1"))) {
			System.out.println(i.multiply(i)); //print 
      
		}		
	}
}



