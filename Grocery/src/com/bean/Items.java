package com.bean;

public class Items {

	public enum ItemType{GROCERIES, NOTGROCERIES}
	
	private String ItemName;
	private int quantity;
	private double cost;
	private ItemType type;
	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Items(String itemName, int quantity, double cost, ItemType type) {
		super();
		ItemName = itemName;
		this.quantity = quantity;
		this.cost = cost;
		this.type = type;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public ItemType getType() {
		return type;
	}
	public void setType(ItemType type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Items [ItemName=" + ItemName + ", quantity=" + quantity + ", cost=" + cost + ", type=" + type + "]";
	}
	
	
}
