package com.dxc.app;

public class Address {
	int id;
	String hno;
	String street;
	String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public <String> Address(int id, java.lang.String hno, java.lang.String street, java.lang.String city) {
		super();
		this.id = id;
		this.hno = hno;
		this.street = street;
		this.city = city;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", hno=" + hno + ", street=" + street + ", city=" + city + "]";
	}

}
