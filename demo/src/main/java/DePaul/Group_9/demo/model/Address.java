package DePaul.Group_9.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.ToString;

@Data
@Entity
@Table(name = "address")  //if name is same with table, no needs this line
@ToString  //lombok
public class Address implements Serializable {
	@Id  // this is a primary key 
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // auto generated 
	int id;
	
	//linux server uper/lower case matter, but window doesn't
	@Column(name = "state") // if name is same with column, no needs
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
