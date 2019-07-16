package com.tmt.practice.java8.lambda;

import java.util.function.Consumer;

public class LambdaVariable2 {
	
	static int instanceValue=3;
	
	
	public static void main(String[] args) {
		int localvalue=3;
		Consumer<Integer> consumer=(i) -> {
			//localvalue++;  not allowed
			instanceValue++; // allowed
			
			
			//Local variables inside Lambdas must be declared effectively Final
			//System.out.println(localValue); localValue should be final for accessing it inside Lambda Expression
		};
		instanceValue++;
		localvalue++;
	}
	
	
}
