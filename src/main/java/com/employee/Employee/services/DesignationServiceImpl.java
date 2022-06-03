package com.employee.Employee.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.Employee.entities.Designation;
import com.employee.Employee.entities.Employee;
import com.employee.Employee.repositories.DesignationRepository;
import com.employee.Employee.repositories.EmployeeRepository;

@Service
public class DesignationServiceImpl implements DesignationService {
	@Autowired
	private DesignationRepository designationRepository;

	@Override
	public List<Designation> getDesignations() {
		return designationRepository.findAll();
	}

	@Override
	public Designation createDesignation(Designation designation) {
		return designationRepository.save(designation);
	}

	@Override
	public Designation updateDesignation(Integer designationId, Designation designation) {
		Designation updateDesignation = designationRepository.findById(designationId).get();
		updateDesignation.setDesignationType(designation.getDesignationType());
		return designationRepository.save(updateDesignation);
	}

	@Override
	public void deleteDesignation(Integer designationId) {
		designationRepository.deleteById(designationId);
	}
	
	

}
