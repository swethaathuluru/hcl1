package com.example.services;

import java.util.List;

import com.example.beans.Employee;
import com.example.beans.Project;
import com.example.exception.CustomException;

public interface IEmployeeService {
	public Employee addEmployee(Employee employee) throws CustomException;
	 
	 public List<Employee> displayEmployee() ;
	 
	public Employee update(Employee employee,int id) throws CustomException ;
	
	public Boolean delete(int id) throws CustomException ;
	
	public  Employee search(int id) throws CustomException ;
	public List<Project> displayProject() ;
	
}
