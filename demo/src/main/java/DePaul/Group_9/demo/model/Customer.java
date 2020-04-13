package DePaul.Group_9.demo.model;

import DePaul.Group_9.demo.model.User;

public class Customer extends User {
	private String Payment_method;
	private String email;
	private String phone;
	private float rating;
	
	public String getPayment_method() {
		return Payment_method;
	}
	public void setPayment_method(String payment_method) {
		Payment_method = payment_method;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}


	

}
