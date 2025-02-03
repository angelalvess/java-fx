package com.angel.app.calculo.intern;

import java.util.Arrays;

public class OpArit {
	
	

	public Double summ(double... numbers) {
		return Arrays.stream(numbers).reduce(0.0, (t,a) -> t+a);
	}
	
}
