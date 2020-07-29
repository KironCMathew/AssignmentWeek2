package com.question3;

import java.util.Scanner;

public class LetterCapitalize {

	public static String LetterCapitalize(String str) {
	    String[] arr = str.split(" ");
	    StringBuffer sb = new StringBuffer();

	    for (int i = 0; i < arr.length; i++) {
	        sb.append(Character.toUpperCase(arr[i].charAt(0)))
	            .append(arr[i].substring(1)).append(" ");
	
	    } 
	    System.out.println(sb);
	    return sb.toString().trim();
	    
	}  
	
	public static void main(String[] args) {
		String word;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a sentence :");
		  word = sc.nextLine();
		  LetterCapitalize(word);
		
	}

}
