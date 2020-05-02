package DePaul.Group_9.demo.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Address implements Serializable {
	String state;
	String city;
	String street_apt;
	int zipcode;
	
//	public String getState() {
//		return state;
//	}
//	public void setState(String state) {
//		this.state = state;
//	}
//	public String getCity() {
//		return city;
//	}
//	public void setCity(String city) {
//		this.city = city;
//	}
//	public String getStreet_apt() {
//		return street_apt;
//	}
//	public void setStreet_apt(String street_apt) {
//		this.street_apt = street_apt;
//	}
//	public int getZipcode() {
//		return zipcode;
//	}
//	public void setZipcode(int zipcode) {
//		this.zipcode = zipcode;
//	}
}
