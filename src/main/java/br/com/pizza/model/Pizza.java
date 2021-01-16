package br.com.pizza.model;

import com.fasterxml.jackson.annotation.JsonAlias;

public class Pizza {
	
	@JsonAlias("Crust")
	private String crust;
	@JsonAlias("Flavor")
	private String flavor;
	@JsonAlias("Order_ID")
	private int order_id;
	@JsonAlias("Size")
	private String size;
	@JsonAlias("Table_No")
	private int table_no;
	@JsonAlias("Timestamp")
	private String timestamp;
	
	public Pizza() {
		
	}
	
	public String getCrust() {
		return crust;
	}
	public void setCrust(String crust) {
		this.crust = crust;
	}
	public String getFlavor() {
		return flavor;
	}
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}
	public int getOrder_id() {
		return order_id;
	}
	public void setOrder_id(int order_id) {
		this.order_id = order_id;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getTable_no() {
		return table_no;
	}
	public void setTable_no(int table_no) {
		this.table_no = table_no;
	}
	public String getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

}
