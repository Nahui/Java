package org.lu.ics.labs;

public abstract class Customer {
	private String id;
	private String name;
	private String phone;
	
	
	public Customer() {
		super();
	}
	
	public Customer(String id, String name, String phone) {
		super();
		this.setID(id);
		this.setName(name);
		this.setPhone(phone);
	}
	
	public String getID() {
		return id;
	}
	
	public void setID(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public abstract String identification();
}
