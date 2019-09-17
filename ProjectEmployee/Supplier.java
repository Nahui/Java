package org.lu.ics.labs;

public class Supplier {
	private String id;
	private String name;
	private String phoneNr;
	
	
	public Supplier() {
		super();
	}
	
	public Supplier(String id, String name, String phoneNr) {
		super();
		this.setID(id);
		this.setName(name);
		this.setPhoneNr(phoneNr);
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
	
	
	public String getPhoneNr() {
		return phoneNr;
	}
	
	public void setPhoneNr(String phoneNr) {
		this.phoneNr = phoneNr;
	}
	
}
