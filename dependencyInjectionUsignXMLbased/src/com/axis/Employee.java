package com.axis;

public class Employee{
	int id;
	String name;
	Address address;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	
	public void setAddress(Address address) {
		this.address=address;
	}
	
	public void displayEmployeeInfo() {
		System.out.println("Id "+id);
		System.out.println("Name "+name);
		System.out.println("Address "+address.streetName);
	}
}