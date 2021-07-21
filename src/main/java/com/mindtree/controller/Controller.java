package com.mindtree.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindtree.entity.mtm.AddressMTM;
import com.mindtree.entity.mtm.EmployeeMTM;
import com.mindtree.entity.otm.AddressOTM;
import com.mindtree.entity.otm.EmployeeOTM;
import com.mindtree.entity.oto.Address;
import com.mindtree.entity.oto.Employee;
import com.mindtree.repository.AddressMTMRepository;
import com.mindtree.repository.AddressOTMRepository;
import com.mindtree.repository.AddressRepository;
import com.mindtree.repository.EmployeeMTMRepository;
import com.mindtree.repository.EmployeeOTMRepository;
import com.mindtree.repository.EmployeeRepository;

@RestController
public class Controller {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	private AddressRepository adrRepo;

	@RequestMapping(method = RequestMethod.GET, path = "oto")
	public List<Employee> getEmployeesOTO() {
		
		//OneToOne BiDirectionalMapping
		
		Employee emp = new Employee();
		emp.setName("name");
		empRepo.save(emp);
		
		Address adr = new Address();
		adr.setAddress("adr");
		adr.setEmployee(emp);
		adrRepo.save(adr);
		
		emp.setAddress(adr);
		
		empRepo.save(emp);
		return empRepo.findAll();
	}
	
	@Autowired
	private EmployeeOTMRepository empOTMRepo;
	
	@Autowired
	private AddressOTMRepository adrOTMRepo;
	
	@RequestMapping(method = RequestMethod.GET, path = "otm")
	public List<EmployeeOTM> getEmployeeOTM() {
		
		//OneToMany BiDirectionalMapping
		
		EmployeeOTM emp = new EmployeeOTM();
		emp.setName("name");
		empOTMRepo.save(emp);
		
		AddressOTM adr = new AddressOTM();
		adr.setAddress("address");
		adr.setEmployee(emp);
		adrOTMRepo.save(adr);
		
		List<AddressOTM> adrList = new ArrayList<>();
		adrList.add(adr);
		emp.setAddress(adrList);
		empOTMRepo.save(emp);
		
		return empOTMRepo.findAll();
	}
	
	@Autowired
	private EmployeeMTMRepository empMTMRepo;
	
	@Autowired
	private AddressMTMRepository adrMTMRepo;
	
	@RequestMapping(method = RequestMethod.GET, path = "mtm")
	public List<EmployeeMTM> getEmployeesMTM() {
		
		//ManyToMany BiDirectionalMapping
		
		EmployeeMTM emp = new EmployeeMTM();
		emp.setName("name");
		empMTMRepo.save(emp);
		
		AddressMTM adr = new AddressMTM();
		adr.setAddress("address");
		adrMTMRepo.save(adr);
		
		List<AddressMTM> adrList = new ArrayList<>();
		adrList.add(adr);
		emp.setAddress(adrList);
		empMTMRepo.save(emp);
		
		List<EmployeeMTM> empList = new ArrayList<>();
		empList.add(emp);
		adr.setEmployees(empList);
		adrMTMRepo.save(adr);
		
		
		return empMTMRepo.findAll();
	}
}
