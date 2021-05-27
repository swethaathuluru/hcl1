package com.example.services;


import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.beans.Employee;
import com.example.beans.Project;
import com.example.dao.EmployeeRdo;
import com.example.dao.ProjectRdo;
import com.example.exception.CustomException;

@Service
public class EmployeeService implements IEmployeeService{
	@Autowired
	private EmployeeRdo rdo;
	@Autowired
	private ProjectRdo prdo;

	public Employee addEmployee(Employee employee) throws CustomException {
		
//		if (!rdo.findById(employee.getId()).isPresent())
//
//			return rdo.save(employee);
//		else
//			throw new CustomException("id already present");
		
		if (!rdo.findById(employee.getId()).isPresent()) {
			prdo.saveAll(employee.getProject100());
			return rdo.saveAndFlush(employee);	
	}else
		throw new CustomException("id already present");
		}
	
	public List<Employee> displayEmployee() {
		
		//List<Employee> list1=rdo.findAll().stream().filter(s->s.getSalary()>10000).collect(Collectors.toList());
		//return list1;
//		List<Employee> list1=rdo.findAll().stream().filter(s->s.getName().startsWith("R")).collect(Collectors.toList());
//		return list1;
			
		return rdo.findAll();

	}

	public Employee update(Employee employee, int id) throws CustomException {
		if (rdo.findById(id).isPresent()) {
			return rdo.saveAndFlush(employee);
		} else
			throw new CustomException("id not present");
	}

	public Boolean delete(int id) throws CustomException {
		if (rdo.findById(id).isPresent()) {
			rdo.deleteById(id);
			return true;
		} else
			throw new CustomException("id not present");

	}

	public Employee search(int id) throws CustomException {
		if (rdo.findById(id).isPresent())
			return rdo.findById(id).get();

		else
			throw new CustomException("id not present");

	}

	public List<Project> displayProject() {
		// TODO Auto-generated method stub
		return prdo.findAll();
	}
	

}
