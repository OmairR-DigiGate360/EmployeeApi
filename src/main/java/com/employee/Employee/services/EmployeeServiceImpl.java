package com.employee.Employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Employee.entities.Employee;
import com.employee.Employee.repositories.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;
	
	//CRUD
	@Override
	public List<Employee> getEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public Employee updateEmployee(Integer empId, Employee employee) {
		Employee updatedEmp = employeeRepository.findById(empId).get();
		updatedEmp.setEmpName(employee.getEmpName());
		updatedEmp.setEmpEmail(employee.getEmpEmail());
		updatedEmp.setEmpPhone(employee.getEmpPhone());
		return employeeRepository.save(updatedEmp);
	}

	@Override
	public void deleteEmployee(Integer empId) {
		employeeRepository.deleteById(empId);
	}
	
	//Get Mapping
	@Override
	public Employee getByName(String name) {
		return employeeRepository.findByEmpName(name);
	}

	@Override
	public Employee getByEmail(String email) {
		return employeeRepository.findByEmpEmail(email);
	}

	@Override
	public Employee getByPhone(String phone) {
		return employeeRepository.findByEmpPhone(phone);
	}
	
	//POST Mapping
	@Override
	public Employee getByName(Employee employee) {
		return employeeRepository.findByEmpName(employee.getEmpName());
	}

	@Override
	public Employee getByEmail(Employee employee) {
		return employeeRepository.findByEmpEmail(employee.getEmpEmail());
	}

	@Override
	public Employee getByPhone(Employee employee) {
		return employeeRepository.findByEmpPhone(employee.getEmpPhone());
	}

}
