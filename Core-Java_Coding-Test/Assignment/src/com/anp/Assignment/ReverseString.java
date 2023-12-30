package com.anp.Assignment;

import java.util.Scanner;

public class ReverseString { // class

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // inputs is taken from console
		
		try {
			System.out.println("Enter a string :");
			String Input = sc.nextLine();
			//chceck for null input
			if(Input == null) {
				System.out.println("Input is null.enter a valid string.");
			   
			}
			//Reverse the string using a for-each loop
			StringBuilder reversedString = new StringBuilder();
			for(char c :Input.toCharArray()) {
				reversedString.insert(0, c);
			}
			
			System.out.println("Reversed String: " + reversedString.toString());
		}catch(NullPointerException e) {
			System.out.println("Error occured:"+e.getMessage());
		}
		catch (Exception e) {
			System.out.println("An error occured:" +e.getMessage());
			
		}finally {
			sc.close();
		}
		
	}

}
