package com.learning;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StreamDemo1 {

	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(2,4,5,2,7,45,64,2,4,1,6,7,3,5,2,5,2,8,8,30,10);
		
		//sum(li);
		System.out.println("SUM----"+li.stream().reduce(0,(a,b)-> a+b));
		
		System.out.println("Multiplication----"+li.stream().reduce(1,(a,b)-> a*b));
		
		System.out.println("count----"+li.stream().distinct().count());
		
		//li.stream().distinct().filter(t->t>10).forEach(System.out::println);

		List<String> name = Arrays.asList("Sangeeta","Santosh","Kul","Kesar","jack","barsha","Arti");
		//name.stream().filter(s->s.length()>=5).filter(s-> !s.startsWith("s")).forEach(System.out::println);
		
		//name.stream().filter(s->s.length()>=3 && !s.startsWith("S")).map(s->"mr."+s).forEach(System.out::println);
		
		//name.stream().filter(s->s.length()>=3 && !s.startsWith("S")).map(s->s.length()).forEach(System.out::println);
		
		//name.stream().sorted().forEach(System.out::println);
		name.stream().sorted(Collections.reverseOrder()).limit(3).forEach(System.out::println);
	}
	
	static void sum(List<Integer> li){
		int sum =0;
		for (Integer i : li) {
			sum = sum +i;
		}
		System.out.println(sum);
	}

}
