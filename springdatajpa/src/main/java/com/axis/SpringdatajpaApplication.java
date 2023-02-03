package com.axis;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.axis.entity.Employee;
import com.axis.repository.EmployeeRepository;

@SpringBootApplication
public class SpringdatajpaApplication implements CommandLineRunner{
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SpringdatajpaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setId(5);
		employee.setName("Rohit");
		employee.setDept("Devloper");
		employee.setAge(22);
		employee.setSalary(100000);
		
		employeeRepository.save(employee);
		
		Employee employee2 = new Employee(3,"Ved",40000,"SAP",22);
		employeeRepository.save(employee2);                       //every time we have to call save method
		
		List<Employee> employees = employeeRepository.findAll();
		
		for(Employee emp : employees) {
			System.out.println(emp.getId()+" "+emp.getName());
		}
		
		Optional<Employee> emp = employeeRepository.findById(1);
		
		
		if(emp.isPresent()) {
			Employee e = emp.get();
			System.out.println(e.getId()+ " "+e.getName()+ " "+emp.get().getDept());  //direct with the emp object
		}
		else {
			System.out.println("No employee found for the given id");
		}
		
	}
	

}
