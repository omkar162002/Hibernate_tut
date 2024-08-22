package Hibernate_tut.com.annotations;


import java.util.Arrays;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="Address")
public class address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="pincode")
	private int id;
	
	private String city;
	
	private String state;
	@Temporal(TemporalType.DATE)
	private Date date;
	@Lob
	private byte[] img;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public byte[] getImg() {
		return img;
	}
	public void setImg(byte[] img) {
		this.img = img;
	}
	public address(int id, String city, String state, Date date, byte[] img) {
		super();
		this.id = id;
		this.city = city;
		this.state = state;
		this.date = date;
		this.img = img;
	}
	public address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "address [id=" + id + ", city=" + city + ", state=" + state + ", date=" + date + ", img="
				+ Arrays.toString(img) + "]";
	}
	
	
	

}

