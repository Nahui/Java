package org.lu.ics.labs;

import java.util.ArrayList;
public class SupplierReg {
	
	private ArrayList<Supplier> supplierReg;
	
	public SupplierReg() {	
		setSupplierReg(new ArrayList<Supplier>());
	}
	
	public SupplierReg(ArrayList<Supplier> supplierReg) {
		super();
		this.supplierReg = supplierReg;
	}
	
	public ArrayList<Supplier> getSupplierReg() {
		return supplierReg;
	}
	
	public void setSupplierReg(ArrayList<Supplier> supplierReg) {
		this.supplierReg = supplierReg;
	}
	
	//insert method
	public void insert(Supplier sup) {
		getSupplierReg().add(sup);
	}
	
	
	//delete method
	public void delete(String id) {
		
		Supplier tempSupplier;
		int i=0;
		boolean find=false;
		while(i<getSupplierReg().size() && find==false) {
			
			tempSupplier=getSupplierReg().get(i);
			
			if(tempSupplier.getID().equals(id)){
				getSupplierReg().remove(i);
				find=true;
			}
			
			i++;
			
		}
	}
	//find method
		
	public Supplier find(String id) {
		
		for(int i=0;i<getSupplierReg().size();i++) {		
			if(getSupplierReg().get(i).getID().equals(id))
				return getSupplierReg().get(i);		
		}
		return null;
		
	}

}
