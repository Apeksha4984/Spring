package com.springJdbc.Entity;

public class Student {
	private int id;
	private String sname;
	private String Address;
	public Student() {
		super();
		
	}
	public Student(int id, String sname, String address) {
		super();
		this.id = id;
		this.sname = sname;
		Address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", sname=" + sname + ", Address=" + Address + "]";
	}
	

}


