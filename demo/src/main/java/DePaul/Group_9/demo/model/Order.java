package DePaul.Group_9.demo.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Map;

public class Order implements Serializable {
	private int orderID;
	private Map<Shoes,Store> orderedShoes;
	private Date order_time;
	private int customerID;
	private int storeID;
	private Address Customer_adrs;
	private Address Merchant_adrs;
	private float order_price;
	private String payment_method;
	
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public Map<Shoes, Store> getOrderedShoes() {
		return orderedShoes;
	}
	public void setOrderedShoes(Map<Shoes, Store> orderedShoes) {
		this.orderedShoes = orderedShoes;
	}
	public Date getOrder_time() {
		return order_time;
	}
	public void setOrder_time(Date order_time) {
		this.order_time = order_time;
	}
	public int getCustomerID() {
		return customerID;
	}
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public Address getCustomer_adrs() {
		return Customer_adrs;
	}
	public void setCustomer_adrs(Address customer_adrs) {
		Customer_adrs = customer_adrs;
	}
	public Address getMerchant_adrs() {
		return Merchant_adrs;
	}
	public void setMerchant_adrs(Address merchant_adrs) {
		Merchant_adrs = merchant_adrs;
	}
	public float getOrder_price() {
		return order_price;
	}
	public void setOrder_price(float order_price) {
		this.order_price = order_price;
	}
	public String getPayment_method() {
		return payment_method;
	}
	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}
	
}
