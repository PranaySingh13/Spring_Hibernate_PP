package com.aartek.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {

	@Id
	//@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int pid;
	
	@Column
	private String productName;
	
	@Column
	private int qty;
	
	@Column
	private int price;

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Product(int pid, String productName, int qty, int price) {
		this.pid = pid;
		this.productName = productName;
		this.qty = qty;
		this.price = price;
	}

	public Product() {
	}
	
}
