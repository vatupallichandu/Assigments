package day9.com;



import java.util.ArrayList;

import java.util.Collections;

import java.util.Comparator;

import java.util.HashSet;

import java.util.List;

import java.util.Objects;

import java.util.Set;
 
class Contact1{

	private String name;

	private String phoneNumber;

	private String email;
	private String dept;

	public Contact1(String name, String phoneNumber, String email, String dept) {

		super();

		this.name = name;

		this.phoneNumber = phoneNumber;

		this.email = email;
		this.dept=dept;

	}

	public String getName() {

		return name;

	}

	public String getPhoneNumber() {

		return phoneNumber;

	}

	public String getEmail() {

		return email;

	}
	public String getDept() {
		return dept;
		
	}

	@Override
	public int hashCode() {
		return Objects.hash(dept, email, name, phoneNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contact1 other = (Contact1) obj;
		return Objects.equals(dept, other.dept) && Objects.equals(email, other.email)
				&& Objects.equals(name, other.name) && Objects.equals(phoneNumber, other.phoneNumber);
	}

	 

	@Override
	public String toString() {
		return "Contact1 [name=" + name + ", phoneNumber=" + phoneNumber + ", email=" + email + ", dept=" + dept
				+ ", getName()=" + getName() + ", getPhoneNumber()=" + getPhoneNumber() + ", getEmail()=" + getEmail()
				+ ", getDept()=" + getDept() + ", hashCode()=" + hashCode() + ", getClass()=" + getClass()
				+ ", toString()=" + super.toString() + "]";
	}

	

	
 
	 

}

