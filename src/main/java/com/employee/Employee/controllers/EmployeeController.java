package com.employee.Employee.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.employee.Employee.entities.Employee;
import com.employee.Employee.services.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@GetMapping("/employee")
	public List<Employee> getEmployees() {
		return employeeService.getEmployees();
	}
	@PostMapping("/employee")
	public Employee createEmployee(@RequestBody Employee employee) {
		return employeeService.createEmployee(employee);
	}
	@PutMapping("/employee/{id}")
	public Employee updateEmployee(@PathVariable("id") Integer empId, @RequestBody Employee employee) {
		return employeeService.updateEmployee(empId, employee);
	}
	@DeleteMapping("/employee/{id}")
	public String deleteEmployee(@PathVariable("id") Integer empId) {
		employeeService.deleteEmployee(empId);
		return "Employee Deleted...";
	}
	@GetMapping("/employee/name/{key}")
	public Employee getByName(@PathVariable("key") String name) {
		return employeeService.getByName(name);
	}
	@GetMapping("/employee/email/{key}")
	public Employee getByEmail(@PathVariable("key") String email) {
		return employeeService.getByEmail(email);
	}
	@GetMapping("/employee/phone/{key}")
	public Employee getByPhone(@PathVariable("key") String phone) {
		return employeeService.getByPhone(phone);
	}
	
	//Request Body
	@PostMapping("/employee/name")
	public Employee getByName(@RequestBody Employee employee) {
		return employeeService.getByName(employee);
	}
	@PostMapping("/employee/email")
	public Employee getByEmail(@RequestBody Employee employee) {
		return employeeService.getByEmail(employee);
	}
	@PostMapping("/employee/phone")
	public Employee getByPhone(@RequestBody Employee employee) {
		return employeeService.getByPhone(employee);
	}
}
