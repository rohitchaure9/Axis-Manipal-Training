package com.axis.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.axis.entity.Employee;
import com.axis.exception.IdNotFoundException;
import com.axis.exception.InValidAgeException;
import com.axis.exception.InValidSalaryException;
import com.axis.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		 if(employee.getAge()<=22) {
			 throw new InValidAgeException("Minimum age should be 23 or above");
		 }
		 else if(employee.getSalary()<=10000) {
			 throw new InValidSalaryException("Salary is less.");
		 }
		 
	        
	     return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = employeeRepository.findById(id);
		if(emp.isPresent())
		{
			return emp.get();
		}
		else {
			throw new IdNotFoundException("No id present to get the value");
		}
		
	}

	@Override
	public Employee updateEmployeeById(int id, Employee employee) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = employeeRepository.findById(id);
		if(emp.isPresent())
		{
			return employeeRepository.save(employee);
		}
		else {
			throw new IdNotFoundException("No id present to get the value");
		}
	}

	@Override
	public String deleteEmployeeById(int id) {
		// TODO Auto-generated method stub
		Optional<Employee> emp = employeeRepository.findById(id);
		if(emp.isPresent())
		{
			employeeRepository.deleteById(id);
			return "Employee Deleted";
		}
		else {
			throw new IdNotFoundException("No id present to get the value");
		}
	}
	

}
