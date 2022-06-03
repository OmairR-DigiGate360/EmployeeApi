package com.employee.Employee.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.employee.Employee.entities.Designation;

public interface DesignationRepository extends JpaRepository<Designation, Integer> {

}
