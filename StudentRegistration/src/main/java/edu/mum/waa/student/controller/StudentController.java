package edu.mum.waa.student.controller;

import javax.validation.Valid;

import edu.mum.waa.student.domain.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class StudentController {
	
	    @RequestMapping(value="/registration",method=RequestMethod.GET)	
	    public String showForm(@ModelAttribute("student") Student student, Model model){
	    	
 	        return "registration";
	    }
	
	 
	
	    @RequestMapping(value="/registration",method=RequestMethod.POST)	
	    public String processForm(@Valid @ModelAttribute("student") Student student,
	    		BindingResult result,Model model){
 
	        if(result.hasErrors()){
	            return "registration";
	        }else{
             return "success";
	
	        }
	
	    }
	    
	}

	

