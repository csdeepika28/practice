package com.deepu2.model;

public class Student {
	private int sId;
	private String firstName;
	private String lastName;


	/**
	 * @param sId
	 * @param firstName
	 * @param lastName
	 */
	public Student(int sId, String firstName, String lastName) {
		
		this.sId = sId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public int getsId() {
		return sId;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setsId(int sId) {
		this.sId = sId;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "Student [sId=" + sId + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}


}
