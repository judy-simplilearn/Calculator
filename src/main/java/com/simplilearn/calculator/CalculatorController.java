package com.simplilearn.calculator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
class CalculatorController {     
	@Autowired
	private CalculatorApplication calculator;
   
	@RequestMapping("/sum")     
	String sum(@RequestParam("a") Integer a, @RequestParam("b") Integer b) {
          return String.valueOf(calculator.sum(a,b));     
	}
}
