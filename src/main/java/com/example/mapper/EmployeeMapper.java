package com.example.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.beans.Employee;

public class EmployeeMapper implements RowMapper<Employee>{
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {

		Employee e = new Employee();
		e.setId(rs.getInt(1));
		e.setName(rs.getString(2));
		e.setDepartment(rs.getString(3));
		e.setSalary(rs.getInt(4));

		return e;
	}
}
