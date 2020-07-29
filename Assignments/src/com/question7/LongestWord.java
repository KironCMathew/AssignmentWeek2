package com.question7;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class LongestWord {
	
	public static String LongestWord() {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter the setence");
		 String string1 = scan.nextLine();
		 
		 String[] word = string1.split( " " );
	     String rts = " ";
	     int index = 0;

	     for ( int i = 0; i < word.length; i++ )
	     {
	         if ( word[i].length() > rts.length() )
	             rts = word[i];

	     }
	     System.out.println( rts.length() );
		return rts;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestWord();
	}

}
