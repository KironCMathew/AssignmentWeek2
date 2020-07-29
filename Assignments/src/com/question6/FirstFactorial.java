package com.question6;

import java.util.Scanner;

public class FirstFactorial {

	public static int firstFactorial(int num) {
		   for(int i = num; i <= num; --i) {
	            if (num % i == 0) {
	                System.out.print(i+"*");
	            }
	}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      number = sc.nextInt();
	      firstFactorial(number);
	}

}
