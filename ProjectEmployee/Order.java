package org.lu.ics.labs;

import java.util.ArrayList;

public class Order {
	private ArrayList<OrderLine> order;
	private String orderNr;
	private int date;

		
		public Order() {
			
			setOrder(new ArrayList<OrderLine>());
		}
		
		public Order(ArrayList<OrderLine> order) {
			super();
			this.order = order;
		}
		
		public ArrayList<OrderLine> getOrder() {
			return order;
		}
		
		public void setOrder(ArrayList<OrderLine> order) {
			this.order = order;
		}
		
		public String getOrderNr() {
			return orderNr;
		}

		public void setOrderNr(String orderNr) {
			this.orderNr = orderNr;
		}

		public int getDate() {
			return date;
		}

		public void setDate(int date) {
			this.date = date;
		}

		//insert method
		public void insert(OrderLine ord) {
			getOrder().add(ord);
		}
		
		
		//delete method
		public void delete(String id) {
			
			OrderLine tempOrder;
			int i=0;
			boolean find=false;
			while(i<getOrder().size() && find==false) {
				
				tempOrder=getOrder().get(i);
				
				if(tempOrder.getID().equals(id)){
					getOrder().remove(i);
					find=true;
				}
				
				i++;
				
			}
		}
		//find method
			
		public OrderLine find(String id) {
			
			for(int i=0;i<getOrder().size();i++) {		
				if(getOrder().get(i).getID().equals(id))
					return getOrder().get(i);		
			}
			return null;
			
		}

	
}
