package com.lti.demo;

public class Person {

	private int pId;
	private String pName;
	private double pSalary;
	
	
	
	public Person(int pId, String pName, double pSalary) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pSalary = pSalary;
	}



	public int getpId() {
		return pId;
	}



	public void setpId(int pId) {
		this.pId = pId;
	}



	public String getpName() {
		return pName;
	}



	public void setpName(String pName) {
		this.pName = pName;
	}



	public double getpSalary() {
		return pSalary;
	}



	public void setpSalary(double pSalary) {
		this.pSalary = pSalary;
	}



	@Override
	public String toString() {
		return "Person [pId=" + pId + ", pName=" + pName + ", pSalary=" + pSalary + "]";
	}
	
	
}
