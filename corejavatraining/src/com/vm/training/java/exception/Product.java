package com.vm.training.java.exception;

public class Product {
	int id;
	String name;
	int  noofdays;
	String How_is_product;
	String product_Recived;
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
	public int getNoofdays() {
		return noofdays;
	}
	public void setNoofdays(int noofdays) {
		this.noofdays = noofdays;
	}
	public String getHow_is_product() {
		return How_is_product;
	}
	public void setHow_is_product(String how_is_product) {
		How_is_product = how_is_product;
	}
	public String getProduct_Recived() {
		return product_Recived;
	}
	public void setProduct_Recived(String product_Recived) {
		this.product_Recived = product_Recived;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", noofdays=" + noofdays + ", How_is_product=" + How_is_product
				+ ", product_Recived=" + product_Recived + "]";
	}
}