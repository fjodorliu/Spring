package com.fjodor.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import com.fjodor.hello.model.Employee;

@Controller
@RequestMapping("employee")
public class EmployeeController {
	
	Employee employee = new Employee();

	@RequestMapping(value = "/{name}", produces = "application/json")
	@ResponseBody
	public Employee getEmployeeInJSON(@PathVariable String name){
		
		employee.setName(name);
		employee.setEmail("fujun.liu@json.com");
		
		return employee;
	}
	
	@RequestMapping(value = "/{name}.xml", method = RequestMethod.GET, produces = "application/xml")
	@ResponseBody
	public Employee getEmployeeInXML(@PathVariable String name){
		
		employee.setName(name);
		employee.setEmail("fujun.liu@xml.com");
		
		return employee;
	}
	
}
