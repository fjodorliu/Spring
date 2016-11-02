package com.fjodor.hello.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

//@Controller
@RestController

public class HelloController {
	
	private Logger loger = LoggerFactory.getLogger(HelloController.class);
	
    //Add the support to fix the incorrect display for Chinese.
	@RequestMapping(value="/hello",method=RequestMethod.GET,produces="text/html;charset=UTF-8")
	public String welcome(@RequestParam(value = "username", required = false)String username){
		
		return "Hello, " + username +"!#´ó´ó#";
	}
	
	@RequestMapping(value="/welcome/{username}",method=RequestMethod.GET)
	public String hello(@PathVariable String username){
		
		loger.info("==INFO==TEST FOR AUDIT LOGGER.");
		loger.debug("==DEBUG==TEST FOR AUDIT LOGGER.");
		loger.error("==ERROR==TEST FOR AUDIT LOGGER.");
		
		//System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<");
		
		//loger.info("FUCK, GET OUT!!!");
		
		return "Welcome, " + username +"!!!!";
		
		
	}
	
	@RequestMapping(value="/home",method=RequestMethod.GET)
	public ModelAndView  hello(){
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("home");
		
		return mv;
	}
	
	@RequestMapping("login") 
    private @ResponseBody String hello(  
            @RequestParam(value = "username", required = false)String username,  
            @RequestParam(value = "password", required = false)String password  
            ){  
        return "Hello "+username+",Your password is: "+password;  
          
    }  
}
