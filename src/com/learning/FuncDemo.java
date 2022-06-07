package com.learning;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FuncDemo {

	public static void main(String[] args) {
	/*	Func1 f = new Func1() {
			@Override
			public int test(int i) { //10*9*...
				System.out.println(i);
				int fact =1;
				for(int n=2; n<=i;n++) {
					fact = fact*n;  //1*2*3*4*5
				}

System.out.println("factorial of my own number-- "+i+"--is ==="+fact);

				return fact;
			}
		};*/
		
		Func1 f = (i)-> {
				System.out.println(i);
				int fact =1;
				for(int n=2; n<=i;n++) {
					fact = fact*n;  //1*2*3*4*5
				}
				System.out.println("factorial of my number-- "+i+"--is ==="+fact);
				return fact;
			};
	
		
		int fact = f.test(5);
		System.out.println(fact);
		
		Func1 f1 = (i)-> {
			int s = i*i;
			System.out.println("Square of-- "+i+"--is ==="+s);
			return s;
		};
		f1.test(5);
		
		Function<Integer,Integer> f2 = (i)-> {
			System.out.println(i);
			int sum =0;
			for(int n=1; n<=i;n++) {
				sum = sum+n;  //1*2*3*4*5
			}
			System.out.println("sum of-- "+i+"--is ==="+sum);
			return sum;
		};
		f2.apply(5);
		
		
		Function<Integer,Boolean> f3 = i-> {
			if(i>18) {
				return true;
			}else {
				return false;
			}
		};
		System.out.println(f3.apply(10));
		 
		Predicate<Integer> p = i-> {
			if(i>18) {
				return true;
			}else {
				return false;
			}
		};
		
		System.out.println(p.test(30));
		
		Consumer<String> c = s->System.out.println("my name is ---"+s);
		c.accept("Arti");
		
		Function<Integer,Integer> ff = i-> {return i*i*i;} ;
	}

}
