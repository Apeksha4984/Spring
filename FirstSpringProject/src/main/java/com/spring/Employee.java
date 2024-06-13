package com.spring;

public class Employee {

	private Integer eId;
	private String eName;
	private String email;

	public Employee(Integer eId, String eName, String email) {
		super();
		this.eId = eId;
		this.eName = eName;
		this.email = email;
	}

	public Employee() {
		super();
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Employee [eId=" + eId + ", eName=" + eName + ", email=" + email + "]";
	}
}