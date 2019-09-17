package org.lu.ics.labs;

public class Article {

		
			private String id;
			private String name;
			private double price;
			
			
			public Article() {
				super();
			}
			
			public Article(String id, String name, double price) {
				super();
				this.setID(id);
				this.setName(name);
				this.setPrice(price);
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
			
			
			public double getPrice() {
				return price;
			}
			
			public void setPrice(double price) {
				this.price = price;
			}
			
			
			
			
		
}
