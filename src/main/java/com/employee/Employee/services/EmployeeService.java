package com.employee.Employee.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.employee.Employee.entities.Employee;

public interface EmployeeService {
	public List<Employee> getEmployees();
	public Employee createEmployee(Employee employee);
	public Employee updateEmployee(Integer empId, Employee employee);
	public void deleteEmployee(Integer empId);
	
	//Get Mapping
	public Employee getByName(String name);
	public Employee getByEmail(String email);
	public Employee getByPhone(String phone);
	
	//Post Mapping
	public Employee getByName(Employee employee);
	public Employee getByEmail(Employee employee);
	public Employee getByPhone(Employee employee);
}
