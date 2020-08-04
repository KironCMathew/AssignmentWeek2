package com.bean;

import java.time.LocalDate;

public class Customer {

	public enum CustomerType{EMPLOYEE,AFFLIATE,CUSTOMER}
	
	private int id;
	private String name;
	private CustomerType type;
	private LocalDate date;
	private Items item;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String name, CustomerType type, LocalDate date, Items item) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.date = date;
		this.item = item;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CustomerType getType() {
		return type;
	}
	public void setType(CustomerType type) {
		this.type = type;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", type=" + type + ", date=" + date + ", item=" + item + "]";
	}
	
	
	
	
}
