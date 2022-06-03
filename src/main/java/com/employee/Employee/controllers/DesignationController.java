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

import com.employee.Employee.entities.Designation;
import com.employee.Employee.services.DesignationService;

@RestController
public class DesignationController {
	@Autowired
	private DesignationService designationService;
	
	@GetMapping("/designation")
	public List<Designation> getDesignations() {
		return designationService.getDesignations();
	}
	@PostMapping("/designation")
	public Designation createDesignation(@RequestBody Designation designation) {
		return designationService.createDesignation(designation);
	}
	@PutMapping("/designation/{id}")
	public Designation updateDesignation(@PathVariable("id") Integer designationId, @RequestBody Designation designation) {
		return designationService.updateDesignation(designationId, designation);
	}
	@DeleteMapping("/designation/{id}")
	public String deleteDesignation(@PathVariable("id") Integer designationId) {
		designationService.deleteDesignation(designationId);
		return "Designation Deleted...";
	}
	
	//Assign Employee Designation
	/*@PutMapping("/designation/{empId}/And/{}")
	public Designation updateDesignation(@PathVariable("id") Integer designationId, @RequestBody Designation designation) {
		return designationService.updateDesignation(designationId, designation);
	}*/
}
