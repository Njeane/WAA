package edu.mum.waa.service;

import edu.mum.waa.domain.Calculator;

public class CalculatorServiceImpl implements  CalculatorService {
    public void add(Calculator calculator) {
        calculator.add();
    }

    public void mult(Calculator calculator) {
calculator.mult();
    }
}
