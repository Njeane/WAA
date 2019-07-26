package edu.mum.waa.controller;

import edu.mum.waa.domain.Calculator;
import edu.mum.waa.service.CalculatorService;
import edu.mum.waa.validator.CalculatorValidator;
import mum.edu.framework.annotation.AutoWired;
import mum.edu.framework.annotation.Controller;
import mum.edu.framework.annotation.RequestMapping;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class CalculatorController {

   @AutoWired
    CalculatorService calculatorService;
   @AutoWired
    CalculatorValidator validator;


    @RequestMapping(value={"/","/calculator"})
    public String inputCalc(Calculator calculator)   {
        return  "/CalculatorForm.jsp" ;
    }

   @RequestMapping(value = "/calculatorSave")
   public String handleCalc(Calculator calculator, HttpServletRequest request, HttpServletResponse response){
       List<String> errors=validator.validate(calculator);
       if(errors.isEmpty()){
           calculatorService.add(calculator);
           calculatorService.mult(calculator);
           request.setAttribute("calculator",calculator);
           return "/WEB-INF/jsp/CalculatorView.jsp";
       }
       else{
           request.setAttribute("error",errors);
           request.setAttribute("calculator",calculator);
           return "/WEB-INF/jsp/CalculatorForm.jsp";

       }

   }

}
