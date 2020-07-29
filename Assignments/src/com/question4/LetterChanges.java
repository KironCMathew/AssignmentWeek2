package com.question4;

import java.util.Scanner;

public class LetterChanges {
	public static void LetterChanges() {
	StringBuffer sbuffer = new StringBuffer();
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the sentence to Letter Change");
	StringBuffer m = new StringBuffer();
	sbuffer.append(input.nextLine());
	
	int len = sbuffer.length();
	for(int i=0;i< len;i++){
	m.append((char)(sbuffer.charAt(i)+1));
	}
	System.out.println(m.toString().replaceAll("!", " "));
	}
	public static void main(String[] args) {
		LetterChanges();
	}
}
