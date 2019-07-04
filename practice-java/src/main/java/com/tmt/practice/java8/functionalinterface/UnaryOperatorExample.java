package com.tmt.practice.java8.functionalinterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	//Unary Operator is used when input and output are of the same type.
	static UnaryOperator<String> concatUnaryOperator=(s) -> s.concat("Jothy");
	
	public static <T> void main(String[] args) {
		
		System.out.println(concatUnaryOperator.apply("Thirumoorthi "));
		
		
		
		 // Instantiate the UnaryOperator interface 
        UnaryOperator<Boolean> booleanUnaryOperator = UnaryOperator.identity(); 
		System.out.println(booleanUnaryOperator.apply(true));
		System.out.println(booleanUnaryOperator.apply(false));
		
		UnaryOperator<Long> longUnaryOperator = UnaryOperator.identity(); 
		System.out.println(longUnaryOperator.apply(1000l));
	}

}
