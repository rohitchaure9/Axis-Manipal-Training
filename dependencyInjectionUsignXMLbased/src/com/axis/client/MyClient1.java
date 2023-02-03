package com.axis.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.axis.Employee;

public class MyClient1{
	public static void main(String[] args) {
		Resource resource = new ClassPathResource("beans.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Employee employee = (Employee) factory.getBean("emp");
		employee.displayEmployeeInfo();
	}
}