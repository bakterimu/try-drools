package com.drul.spring;

public class Order {
	private String name;
	private String card;
	private Integer price;
	private Integer discount;
	
	
	public Order() {
	}
	
	public Order(String name, String card, int price, int discount) {
		super();
		this.name = name;
		this.card = card;
		this.price = price;
		this.discount = discount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getDiscount() {
		return discount;
	}
	public void setDiscount(int discount) {
		this.discount = discount;
	}
}
