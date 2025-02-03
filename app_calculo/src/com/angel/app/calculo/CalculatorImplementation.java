package com.angel.app.calculo;

import com.angel.app.Calculator;
import com.angel.app.calculo.intern.OpArit;

public class CalculatorImplementation implements Calculator  {

	private OpArit opArit = new OpArit();

	public double summ(double... numbers) {
		return opArit.summ(numbers);
	}
	
		
}
