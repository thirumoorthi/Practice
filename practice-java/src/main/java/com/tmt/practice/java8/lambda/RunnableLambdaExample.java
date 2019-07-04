package com.tmt.practice.java8.lambda;

public class RunnableLambdaExample {

	public static void main(String... args) {
		/* Prior to java 8 
		*/
		
		Runnable runnable=new Runnable() {
			@Override
			public void run() {
				System.out.println("Inside Runnable 1");			
			}
		};
		new Thread(runnable).start();
	
		/* 
		 Java 8 Lambda  
		*/
		// () -> {}

		Runnable runnableLambda1 = () -> {System.out.println("Inside Runnable 2"); };
		new Thread(runnableLambda1).start();
		
		Runnable runnableLambda2 = () -> System.out.println("Inside Runnable 3");
		new Thread(runnableLambda2).start();
		
		new Thread(() -> System.out.println("Inside Runnable 4")).start();
		
		new Thread(() -> {  // required {} for more than one statements
			System.out.println("Inside Runnable 5");
			System.out.println("Inside Runnable 6");
		}).start();
		
		
	}
	
	
}
