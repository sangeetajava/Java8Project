package com.learning;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class MethodReferenceDemo {

	public static void main(String[] args) {
		/*Func1 f1 = new Func1() {
			@Override
			public int test(int i) {
				return i*i;
			}
		};*/
		
	/*	Func1 f1= i->{System.out.println("I m in multiplication logic");
		return i*i;};*/
		
		
		Func1 f1 = StreamDemo2::square;  //references to Static method 
		System.out.println(f1.test(2));
		System.out.println(f1.test(4));
		
		StreamDemo2 demo = new StreamDemo2();
		Func1 f2 = demo::cube; ////references to instance method
		
		System.out.println(f2.test(2));
		System.out.println(f2.test(4));
		
		//AnyInterface ff = StreamDemo2::square;
		Function<Long,Integer> ff= Math::toIntExact; 
		//ff.apply(3666);
		
		Consumer<String> c = System.out::println;
		c.accept("testing");
		
		//Reference r = new Reference(23);
		//Reference r1 = new Reference("ARti",23);
	//	Consumer<Integer> m = t->System.out.println("your age is ---"+t);
		Consumer<Integer> c1 = Reference:: new; //constructor reference
		BiConsumer<String,Integer> bc1 = Reference:: new;
		
		c1.accept(23);
		bc1.accept("arti", 28);
		
	//	Function<Long,Integer> ff1 = Reference:: new;
	}

}
