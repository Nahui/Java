package org.lu.ics.labs;

public class CompanyCustomer extends Customer{
	private String corporated;
	
	public CompanyCustomer() {
		System.out.println("Hi from CompanyCustomer");
	}
	
	public CompanyCustomer(String id, String name, String phone) {
		super(id, name, phone);
		System.out.println("Hello from CompanyCustomer(Str,Str,Str)");
	}
	
	public CompanyCustomer(String id, String name, String phone, String corporated) {
		super(id, name, phone);
		this.setCorporated(corporated);
		System.out.println("Hello from CompanyCustomer(Str,Str,Str,Str)");
	}
	
	public String getCorporated() {
		return corporated;
	}
	
	public void setCorporated(String corporated) {
		this.corporated = corporated;
	}
	
	public String identification() {
		return this.getCorporated();
	}

}
