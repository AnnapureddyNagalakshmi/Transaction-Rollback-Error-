package com.DbJpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.DbJpa.entity.Address;
import com.DbJpa.entity.Employee;
import com.DbJpa.repo.AddressRepo;
import com.DbJpa.repo.EmployeeRepo;

@Service
public class EmployeeService {
	
	private EmployeeRepo empRepo;
	private AddressRepo addRepo;
	
	
	public EmployeeService(EmployeeRepo empRepo,AddressRepo addRepo) {
		super();
		this.empRepo=empRepo;
		this.addRepo=addRepo;
	}
	@Transactional(rollbackFor = Exception.class)	//This annotation is used for if one class execute successfully but
													//but after entering into second class it may cause an error that's
													//that's why we use this annotation if one annotation is not execute 
													//properly both class classes execution will be stopped
	public void saveDate() {
		Employee emp=new Employee();
		emp.setEmpId(202);
		emp.setEmpName("varun");
		emp.setEmpSal(50000.00);
		empRepo.save(emp);
		int n=10/0;
		Address add=new Address();
		add.setAddrId(505);
		add.setEmpId(202);
		add.setCity("Hyderabad");
		add.setCountry("India");
		addRepo.save(add);
	}

}
