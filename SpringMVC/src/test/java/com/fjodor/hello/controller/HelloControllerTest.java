package com.fjodor.hello.controller;

import java.nio.charset.Charset;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;

import java.io.IOException;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration 
@ContextConfiguration(locations = {"/WEB-INF/springMVC-servlet.xml" })
public class HelloControllerTest {
	@Autowired
    protected WebApplicationContext wac;
 
    protected MockMvc mockMvc;
    
    public static final MediaType APPLICATION_JSON_UTF8 = new MediaType(MediaType.APPLICATION_JSON.getType(), MediaType.APPLICATION_JSON.getSubtype(), Charset.forName("utf8"));
    
    @Before
	public void init(){
		this.mockMvc = webAppContextSetup(this.wac).build();
	}
	
	@Test
	public void testGetAllSubscriptionGroups() throws Exception {
		mockMvc.perform(
				get("/welcome/fjodor")
				.accept(APPLICATION_JSON_UTF8))
				.andExpect(status().isOk());
	}
	
}
