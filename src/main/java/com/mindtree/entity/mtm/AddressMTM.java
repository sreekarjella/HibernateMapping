package com.mindtree.entity.mtm;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class AddressMTM {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String address;
	@ManyToMany
	@JsonBackReference
	@JoinTable(name = "ADDRESS_EMPLOYEE",
	joinColumns = @JoinColumn(name = "ADDRESS_ID"),
	inverseJoinColumns = @JoinColumn(name = "EMPLOYEE_ID"))
	private List<EmployeeMTM> employees;

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

	public List<EmployeeMTM> getEmployees() {
		return employees;
	}

	public void setEmployees(List<EmployeeMTM> employees) {
		this.employees = employees;
	}

}
