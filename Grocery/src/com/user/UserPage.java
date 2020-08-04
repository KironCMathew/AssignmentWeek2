package com.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.bean.Customer;
import com.bean.Customer.CustomerType;
import com.bean.Items;
import com.bean.Items.ItemType;

public class UserPage {

	public static void main(String[] args) {
		
		Items item1 = new Items("Mangoes",7,50,ItemType.GROCERIES);
		Items item2 = new Items("Pencil",2,10,ItemType.NOTGROCERIES);
		Items item3 = new Items("Bananas",8,10,ItemType.GROCERIES);
		
		String dateTime = "2012-02-22";
		LocalDate d1 = LocalDate.parse(dateTime);
		
		String dateTime1 = "2015-5-20";
		LocalDate d2 = LocalDate.parse(dateTime);
		
		String dateTime2 = "2016-2-15";
		LocalDate d3 = LocalDate.parse(dateTime);
		
		Customer c1 = new Customer(1,"Ravi",CustomerType.EMPLOYEE,d1,item1);
		Customer c2 = new Customer(2,"Tom",CustomerType.AFFLIATE,d2,item2);
		Customer c3 = new Customer(3,"Jerry",CustomerType.CUSTOMER,d3,item3);
		
		List<Customer> items = new ArrayList();
		
		items.add(c1);
		items.add(c2);
		items.add(c3);
		
		double totalCost = 0, discount=0, groceryTotal= 0, notGroceryTotal =0;
		double commonDiscount = 0.05;
		
		for(Customer cus: items) {
			if(cus.getItem().getType()== ItemType.GROCERIES)
			{
				groceryTotal = groceryTotal + cus.getItem().getCost()*cus.getItem().getCost();
				
			}
			else if(cus.getItem().getType()== ItemType.NOTGROCERIES)
			{
				notGroceryTotal= notGroceryTotal + cus.getItem().getCost()*cus.getItem().getCost();	
			}
			
	    if(cus.getType()==CustomerType.AFFLIATE)
			{
				discount = groceryTotal * 0.01;
				totalCost = groceryTotal - discount;
		    }
		 
		else if(cus.getType()==CustomerType.EMPLOYEE)
			{
				discount = groceryTotal * 0.03;
				totalCost = groceryTotal -discount;
			} 
		else if(cus.getType()==CustomerType.CUSTOMER)
			{
				int yearDiff = LocalDate.now().getYear()-cus.getDate().getYear();
				if( yearDiff >= 2) {
					discount = notGroceryTotal * 0.05;
					totalCost = groceryTotal + notGroceryTotal - discount;
				}
				else {
					cus.setDate(LocalDate.now());
					totalCost = groceryTotal+ notGroceryTotal-discount;
				}
			}
			System.out.println(totalCost- commonDiscount);
		}

		}
		
		
	}


