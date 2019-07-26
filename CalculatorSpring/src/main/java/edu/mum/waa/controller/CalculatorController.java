package edu.mum.waa.controller;

import edu.mum.waa.domain.Calculator;
import edu.mum.waa.service.CalculatorService;
import edu.mum.waa.service.CalculatorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CalculatorController {

@Autowired
CalculatorService calculatorService;

    @RequestMapping(value={"/","/calculator"} , method = RequestMethod.GET)
    public String inputCalc(Calculator calculator ) throws Exception {
        return  "CalculatorForm" ;
    }
    @RequestMapping(value = "/calculator", method = RequestMethod.POST)
    public String handleCalculator(Calculator calculator)throws Exception{
        if(calculator.getAdd1()!=null&& calculator.getAdd2()!=null){
            calculatorService.add(calculator);
        }
        if(calculator.getAdd1()!=null&& calculator.getAdd2()!=null){
            calculatorService.mult(calculator);
        }
        return "CalculatorView";
    }

}
