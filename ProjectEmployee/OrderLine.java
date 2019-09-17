package org.lu.ics.labs;


public class OrderLine {

	private int quantity;
	private String id;
	
	
	public OrderLine() {
		super();
	}
	
	public OrderLine(int quantity) {
		super();
		this.setQuantity(quantity);
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getID() {
		return id;
	}

	public void setID(String id) {
		this.id = id;
	}
	
	
	
}
