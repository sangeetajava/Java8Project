package com.learning;

import java.util.*;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void main(String[] args) {
		List<String> li = Arrays.asList("aaa","aaa","aaa","baab","fff","ddd","asas","wdsa","wdsa","wdsa","wdsa","wdsa");
		int count =0;
		Set<String> set = new LinkedHashSet<String>();
		for (String string : li) {
			if(string.contains("a")) {
				//System.out.println(string);
				set.add(string);
				//count ++;
				if(set.size() >=3) {
					break;
				}
			}
		}
		
		//li.stream().forEach(t->System.out.println("1st----"+t));
		
		//Intermediate / terminal 
		
		li.stream().filter(s->s.contains("a")).distinct().limit(3).forEach(t->System.out.println("1st----"+t));
		
		List<String> subLi = li.stream().filter(s->s.contains("a")).distinct().limit(3).skip(1).collect(Collectors.toList());
		System.out.println(subLi);
	}
}
