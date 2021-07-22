package com.mindtree.entity.otm;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class AddressOTM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	@ManyToOne(cascade = CascadeType.ALL)
	@JsonBackReference
	private EmployeeOTM employee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public EmployeeOTM getEmployee() {
		return employee;
	}

	public void setEmployee(EmployeeOTM employee) {
		this.employee = employee;
	}

}
