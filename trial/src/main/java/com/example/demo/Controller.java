package com.example.demo;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Controller {

	@Autowired
	Repositery Repositery;
	
	@PostMapping("add")
	public ResponseEntity<Response> display(@RequestBody User user)
	{ 
		
		    Date date = new Date(); 
		    user.setEntered_on(date);		    
		    System.out.println(user.getEntered_on());
		    
		    char c=user.getOpe();
		    
		    int result = 0;
		    switch(c)
		    {
		    case '+':
		    	result=user.getInput1()+user.getInput2();
		    	break;
		    case '-':
		    	result=user.getInput1()-user.getInput2();
		    	break;
		    case '*':
		    	result=user.getInput1()*user.getInput2();	
		    	break;
		    case '/':
		    	result=user.getInput1()/user.getInput2();
		    	break;
		    }
		user.setResult(result);
		Repositery.save(user);
		return new ResponseEntity<>(new Response(user.getResult(),user.getEntered_on()),HttpStatus.OK);
	}
	
}

