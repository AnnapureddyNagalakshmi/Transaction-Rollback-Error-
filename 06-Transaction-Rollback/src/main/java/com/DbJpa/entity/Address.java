package com.DbJpa.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Emp_add")
public class Address {
	@Id
	private Integer addrId;
	private String city;
	private String country;
	private Integer empId;
	public Integer getAddrId() {
		return addrId;
	}
	public void setAddrId(Integer addrId) {
		this.addrId = addrId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public Integer getEmpId() {
		return empId;
	}
	public void setEmpId(Integer empId) {
		this.empId = empId;
	}
	public Address(Integer addrId, String city, String country, Integer empId) {
		super();
		this.addrId = addrId;
		this.city = city;
		this.country = country;
		this.empId = empId;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
