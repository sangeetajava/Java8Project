package com.learning;

public class Demo {

	public static void main(String[] args) {
		
		Functional.print("ssss");
		Functional.print1("sdfghj");
		
	/*	Functional f1 = new Functional() {
			@Override
			public void add() {
				System.out.println("I love java programming");
			}
		};*/
		
		Functional f1 = () -> System.out.println("I Like java programming");
		f1.add();
		f1.print("java", 22);
		f1.print1("test", 20);
		
		
		Functional f2 = new Functional() {
			@Override
			public void add() {
				System.out.println("I love functional programming learning");
			}
		};
		
		/*Func2 func = new Func2() {
			@Override
			public void add(int number) {
				System.out.println("what value is tghe input==="+number);
			}
		};*/
		
		Func2 func = (n1,n2) -> System.out.println("multiply========"+n1*n2);
		
		func.add(2, 3);
			
		Func2 func1 = (n1,n2) -> System.out.println("multiply==="+n1/n2);
		
	}

}
