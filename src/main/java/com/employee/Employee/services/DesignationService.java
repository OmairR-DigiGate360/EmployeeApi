package com.employee.Employee.services;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.employee.Employee.entities.Designation;
import com.employee.Employee.entities.Employee;

public interface DesignationService {
	public List<Designation> getDesignations();
	public Designation createDesignation(Designation designation);
	public Designation updateDesignation(Integer designationId, @RequestBody Designation designation);
	public void deleteDesignation(Integer designationId);
}
