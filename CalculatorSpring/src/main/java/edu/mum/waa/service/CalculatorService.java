package edu.mum.waa.service;

import edu.mum.waa.domain.Calculator;
import org.springframework.stereotype.Service;


public interface CalculatorService {
    public void add(Calculator calculator);
    public void mult(Calculator calculator);

}
