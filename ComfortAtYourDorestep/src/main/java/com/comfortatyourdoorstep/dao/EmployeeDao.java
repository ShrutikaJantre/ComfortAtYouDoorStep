package com.comfortatyourdoorstep.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.comfortatyourdoorstep.entities.Employee;

@Component
public class EmployeeDao {

	@Autowired
	private IEmployee iEmployee;
	
	public Employee addEmployee(Employee emp) {
		
		Employee result= iEmployee.save(emp);
		
		return result;
	}

	public List<Employee> getAllEmployees() {
		List<Employee> list=(List<Employee>)this.iEmployee.getall();
        return list;
	}

	public void deleteemp(int id) {
		iEmployee.deleteById(id);
		
	}
}
