package com.tmt.practice.java8.methodReference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	
	static Function<String, String> toUpperCaseLambda1 = (s) -> s.toUpperCase();  // in intellij click alt + enter
	static Function<String, String> toUpperCaseLambda2 = String::toUpperCase; // using method references
	
	public static void main(String[] args) {
		System.out.println(toUpperCaseLambda1.apply("thirumoorthi"));
		System.out.println(toUpperCaseLambda2.apply("jothy"));
	}
}
