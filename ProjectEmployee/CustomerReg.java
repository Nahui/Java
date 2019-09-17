package org.lu.ics.labs;

import java.util.ArrayList;
public class CustomerReg {
private ArrayList<Customer> customerReg;
	
	public CustomerReg() {
		
		setCustomerReg(new ArrayList<Customer>());
	}
	
	public CustomerReg(ArrayList<Customer> customerReg) {
		super();
		this.customerReg = customerReg;
	}
	
	public ArrayList<Customer> getCustomerReg() {
		return customerReg;
	}
	
	public void setCustomerReg(ArrayList<Customer> customerReg) {
		this.customerReg = customerReg;
	}
	
	//insert method
	public void insert(Customer cus) {
		getCustomerReg().add(cus);
	}
	
	
	//delete method
	public void delete(String id) {
		
		Customer tempCustomer;
		int i=0;
		boolean find=false;
		while(i<getCustomerReg().size() && find==false) {
			
			tempCustomer=getCustomerReg().get(i);
			
			if(tempCustomer.getID().equals(id)){
				getCustomerReg().remove(i);
				find=true;
			}
			
			i++;
			
		}
	}
	//find method
		
	public Customer find(String id) {
		
		for(int i=0;i<getCustomerReg().size();i++) {		
			if(getCustomerReg().get(i).getID().equals(id))
				return getCustomerReg().get(i);		
		}
		return null;
		
	}
}
