package com.tmt.practice.java8.functionalinterface;

import java.util.function.Function;

public class FunctionExample {

	static Function<String, String> toUpperFunction = (name) -> name.toUpperCase();
	static Function<String, String> concatFunction = (name) -> name.concat(" jothy");
	
	
	public static void main(String[] args) {
		System.out.println(toUpperFunction.apply("thirumoorthi"));
		
		// andThen
		System.out.println(toUpperFunction.andThen(concatFunction).apply("thirumoorthi"));
		
		//compose
		System.out.println(toUpperFunction.compose(concatFunction).apply("thirumoorthi"));

		
		
	}

}
