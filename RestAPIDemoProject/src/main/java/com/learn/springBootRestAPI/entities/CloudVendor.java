package com.learn.springBootRestAPI.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cloud_vendor_info")
public class CloudVendor 
{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int vendorId;
	private String name;
	private String address;
	private String contact;

	public CloudVendor() {
		// TODO Auto-generated constructor stub
	}

	public CloudVendor(int vendorId, String name, String address, String contact) {
		super();
		this.vendorId = vendorId;
		this.name = name;
		this.address = address;
		this.contact = contact;
	}

	public int getVendorId() {
		return vendorId;
	}

	public void setVendorId(int vendorId) {
		this.vendorId = vendorId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "CloudVendor [vendorId=" + vendorId + ", name=" + name + ", address=" + address + ", contact=" + contact
				+ "]";
	}

}
