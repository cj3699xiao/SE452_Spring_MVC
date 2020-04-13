package DePaul.Group_9.demo.model;

import java.io.Serializable;
import java.util.List;

public class Store implements Serializable {
	private int storeID;
	private String store_name;
	private List<Shoes> Shoes_on_sale;
	private List<String> accepted_payment_method;
	private String store_email;
	private String phone;
	private float ratring;
	
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public String getStore_name() {
		return store_name;
	}
	public void setStore_name(String store_name) {
		this.store_name = store_name;
	}
	public List<Shoes> getShoes_on_sale() {
		return Shoes_on_sale;
	}
	public void setShoes_on_sale(List<Shoes> shoes_on_sale) {
		Shoes_on_sale = shoes_on_sale;
	}
	public List<String> getAccepted_payment_method() {
		return accepted_payment_method;
	}
	public void setAccepted_payment_method(List<String> accepted_payment_method) {
		this.accepted_payment_method = accepted_payment_method;
	}
	public String getStore_email() {
		return store_email;
	}
	public void setStore_email(String store_email) {
		this.store_email = store_email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public float getRatring() {
		return ratring;
	}
	public void setRatring(float ratring) {
		this.ratring = ratring;
	}
}
