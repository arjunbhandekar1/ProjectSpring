package com.rest.api.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity

public class Items {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "itemId")
	private long id;

	@Column(name = "itemName")
	private String name;

	@Column(name = "itemUnitPrice")
	private double unitPrice;

	@Column(name = "itemQuantity")
	private int quantity;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Items(long id, String name, double unitPrice, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
	}

	public Items() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Items [id=" + id + ", name=" + name + ", unitPrice=" + unitPrice + ", quantity=" + quantity + "]";
	}
	
	@ManyToOne
	Order order;

//	
}
