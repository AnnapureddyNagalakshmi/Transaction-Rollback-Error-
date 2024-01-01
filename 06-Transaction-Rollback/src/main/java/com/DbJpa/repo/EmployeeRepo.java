package com.DbJpa.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DbJpa.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Serializable>{

}
