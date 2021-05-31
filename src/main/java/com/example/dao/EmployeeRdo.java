package com.example.dao;

import java.util.ArrayList;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.beans.Employee;

@Repository
public interface EmployeeRdo extends JpaRepository<Employee, Integer> {

//	@Autowired
//	JdbcTemplate template;
//		//public static JdbcTemplate template = ConnectionUtil.getConnection();
//
//		public Employee addEmployee(Employee employee) throws CustomException {
//		     if(searchById(employee.getId())==false) {
//				String sql = "insert into emp values(?,?,?,?)";
//
//				template.update(sql, employee.getId(), employee.getName(), employee.getDepartment(), employee.getSalary());
//				return employee;
//
//			}else
//				throw new CustomException("employee id already present");
//			}
//
//
//		public Boolean update(Employee employee,int id) throws CustomException {
//			 if(searchById(id)==true) {
//			String sql = "update emp Set name =?,department=?,salary=? where id=?";
//			template.update(sql, employee.getName(),employee.getDepartment(),employee.getSalary(),id);
//			return true;
//		}else
//			throw new CustomException("no such data found");
//		
//		}
//
//		public Boolean delete(int id) throws CustomException {
//			 if(searchById(id)==true) {
//			String sql = "delete from emp where id = ?";
//			template.update(sql, id);
//			return true;
//		}else
//			throw new CustomException("no such data found");
//			
//		}
//
//		public List<Employee> displayEmployee() {
//			
//			List<Employee> list = new ArrayList<Employee>();
//
//			String sql = "select id,name,department,salary from emp";
//			
//			return template.query(sql, new EmployeeMapper());
//
//		}
//
//	    public List<Employee> search(int id) throws CustomException {
//		
//	    	 if(searchById(id)==true) {
//			String sql = "select id,name,department,salary from emp where id=?";
//			List<Employee> list = template.query(sql, new EmployeeMapper(), id);
//			return list;
//	    }else
//				throw new CustomException("no such id found");
//				
//			}
//		
//
//		public  boolean searchById(int id) {
//
//			String sql = "select id,name,department,salary from emp where id=?";
//			List<Employee> list = template.query(sql, new EmployeeMapper(), id);
//			if(list.size()==0)
//			return false;
//			else
//				return true;
//		}
}
