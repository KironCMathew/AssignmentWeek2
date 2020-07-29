package com.weeklyassignment2;

import java.util.Scanner;

public class RetailStoreDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Select from the options");
		System.out.println("1. Employee");
		System.out.println("2. Affiliate");
		
		while(true)
		{
			switch(sc.next())
			{
			case "1" :
				System.out.println("Enter number of years");
				int years = sc.nextInt();
				System.out.println("Enter bill amount");
				double bill = sc.nextInt();
				double afterDiscount1;
				
				if(years > 2)
				{
					afterDiscount1 = bill - bill* 0.05;
					System.out.println(afterDiscount1);
				}
				else if( bill > 100)
				{
				 double x = bill % 100 ;
				 afterDiscount1 = bill - x * 5;
				 System.out.println(afterDiscount1);
				  }
				
				else
				{
					afterDiscount1 = bill - bill * 0.03;
					System.out.println(afterDiscount1);
				}
				break;
				
			case "2" :
				System.out.println("Enter number of years");
				int years1 = sc.nextInt();
				System.out.println("Enter bill amount");
				double bill1 = sc.nextInt();
				double afterDiscount;
				
				if(years1 > 2)
				{
				  afterDiscount = bill1 - bill1* 0.05;
					System.out.println(afterDiscount);
				}
				else if( bill1 > 100)
				{
				 double x = bill1 % 100 ;
				 afterDiscount = bill1 - x * 5;
				 System.out.println(afterDiscount);
				  }
				
				else
				{
					afterDiscount = bill1 - bill1 * 0.01;
					System.out.println(afterDiscount);
				}
				break;
			 default:
		           System.err.println("Enter correct option");
		           break;	
				
			}
		}
	}

}
