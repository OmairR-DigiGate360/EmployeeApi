package com.employee.Employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Employee.entities.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	public Employee findByEmpName(String name);
	public Employee findByEmpEmail(String email);
	public Employee findByEmpPhone(String phone);
}
