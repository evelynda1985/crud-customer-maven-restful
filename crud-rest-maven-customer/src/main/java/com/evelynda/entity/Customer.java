package com.evelynda.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity //import javax.persistence.Entity;
@Table(name="customer")
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="customer_id") //name on the DB
	private int id;
	
	@Column(name="customer_firstName")
	private String firstName;
	
	@Column(name="customer_lastname")
	private String lastName;
	
	@Column(name="customer_socSecurityNum")
	private String socSecurityNum;
	
	//private Address billingAddres;
	//private Address shippingAddress;
	
	public Customer() {	}

	public Customer(String firstName, String lastName, String socSecurityNum/*, Address billingAddres,
			Address shippingAddress*/) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socSecurityNum = socSecurityNum;
		//this.billingAddres = billingAddres;
		//this.shippingAddress = shippingAddress;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSocSecurityNum() {
		return socSecurityNum;
	}

	public void setSocSecurityNum(String socSecurityNum) {
		this.socSecurityNum = socSecurityNum;
	}

	/*public Address getBillingAddres() {
		return billingAddres;
	}

	public void setBillingAddres(Address billingAddres) {
		this.billingAddres = billingAddres;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public void setShippingAddress(Address shippingAddress) {
		this.shippingAddress = shippingAddress;
	}*/

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", socSecurityNum=" + socSecurityNum
				+ "]";
	}

	/*@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", socSecurityNum=" + socSecurityNum
				+ "\n "+ " billingAddres=" + billingAddres + "\n " +  " shippingAddress=" + shippingAddress + "]";
	}*/
	
	

}
