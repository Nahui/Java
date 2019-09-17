package org.lu.ics.labs;

public class PrivateCustomer extends Customer {
	
	
	private String ssn; 
	
	public PrivateCustomer() {
		System.out.println("Hi from PrivateCustomer");
	}
	
	public PrivateCustomer(String id, String name, String phone) {
		super(id, name, phone);
		System.out.println("Hello from PrivateCustomer(Str,Str,Str)");
	}
	
	public PrivateCustomer(String id, String name, String phone, String ssn) {
		super(id, name, phone);
		this.setSsn(ssn);
		System.out.println("Hello from PrivateCustomer(Str,Str,Str,Str)");
	}
	
	public String getSsn() {
		return ssn;
	}
	
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
	public String identification() {
		return this.getSsn();
	}
}
