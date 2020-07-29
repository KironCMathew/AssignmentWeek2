package com.question2;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {

	static String AlphabetSoup(String str) {
		char charArray[] = str.toCharArray();
	      Arrays.sort(charArray);
	      System.out.println(new String(charArray));
		return str;
		
	}
	public static void main(String[] args) {
	  String word;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a word :");
	  word = sc.next();
	  AlphabetSoup(word);

	}

}
