package com.hughes.model;

public class Citizen {
	
	private int aadharNumber;
	private String citizenName;
	private Long mobNumber;
	private String address;
	private int income;
	private String state;
	
	public Citizen(){}
	
	public Citizen(int aadhar, String citizenName, Long mobNumber,String address,int income,String state) {
		this.aadharNumber = aadhar;
		this.citizenName = citizenName;
		this.mobNumber = mobNumber;
		this.address = address;
		this.income = income;
		this.state = state;
	}

	public int getAadharNumber() {
		return aadharNumber;
	}

	public void setAadharNumber(int aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	public String getCitizenName() {
		return citizenName;
	}

	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}

	public Long getMobNumber() {
		return mobNumber;
	}

	public void setMobNumber(Long mobNumber) {
		this.mobNumber = mobNumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getIncome() {
		return income;
	}

	public void setIncome(int income) {
		this.income = income;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	

}
