package com.fjodor.hello.model;

//import javax.xml.bind.annotation.XmlRootElement;

//import org.springframework.http.converter.xml.MappingJackson2XmlHttpMessageConverter;

//@XmlRootElement(name = "Employee")
public class Employee {
	
    String name;
    String email;
    
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
    
}
