package com.question5;

import java.util.Scanner;

public class ReserveOrder {

	static String ReverseOrder(String str) {
		StringBuilder input1 = new StringBuilder(); 
		 
        input1.append(str); 
  
        // reverse StringBuilder input1 
        input1 = input1.reverse(); 
  
        // print reversed String 
        System.out.println(input1);  
		return str;
		
	}
	
	public static void main(String[] args) {
		String word;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a sentence :");
		  word = sc.nextLine();
		  ReverseOrder(word);
	}
}
