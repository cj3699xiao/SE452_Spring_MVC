package DePaul.Group_9.demo.model;

public class Merchant extends User {
	private int storeID;
	private Address ship_address;
	private String personal_email;
	private String phone;
	private float rating;
	
	public int getStoreID() {
		return storeID;
	}
	public void setStoreID(int storeID) {
		this.storeID = storeID;
	}
	public Address getShip_address() {
		return ship_address;
	}
	public void setShip_address(Address ship_address) {
		this.ship_address = ship_address;
	}
	public String getPersonal_email() {
		return personal_email;
	}
	public void setPersonal_email(String personal_email) {
		this.personal_email = personal_email;
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
