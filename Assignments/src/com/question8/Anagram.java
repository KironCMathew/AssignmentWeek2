package com.question8;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
	  static void isAnagram() {  
		  Scanner scan = new Scanner(System.in);
			System.out.println("Enter the two strings to check");
			String string1 = scan.nextLine();
		    String string2 = scan.nextLine();
			char[] charArray = string1.toCharArray();
			char[] charArray1 = string2.toCharArray();

			Arrays.sort(charArray);
			Arrays.sort(charArray1);
			String sortFirst=new String(charArray);
			String sortSecond=new String(charArray1);
			if(sortFirst.equals(sortSecond))
			{
				System.out.println("Strings are anagram");
			}
			else {
					System.out.println("Strings are not an anagram");	
			}
	    }  
	  
	  public static void main(String[] args) {
			// TODO Auto-generated method stub
		  isAnagram();
		}
}
