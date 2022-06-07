package com.learning;

@FunctionalInterface
public interface Functional {
	
	public void add();
	
	static void print(String str) {
		System.out.println("calling static print---"+str);
	}
	
	default void print(String str, int age) {
		System.out.println("calling default print name--"+str+"--age---"+age);
	}
	
	static void print1(String str) {
		System.out.println("calling static print---"+str);
	}
	
	default void print1(String str, int age) {
		System.out.println("calling default print name--"+str+"--age---"+age);
	}
}
