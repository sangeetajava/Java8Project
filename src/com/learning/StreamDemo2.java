package com.learning;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo2 {

	public static void main(String[] args) {
		List<Employee> eList = new ArrayList<Employee>();
		eList.add(new Employee(13,"Jack","IT",1222,23));
		eList.add(new Employee(10,"Jack","IT",2222,23));
		eList.add(new Employee(2,"Mack","School",2254,33));
		eList.add(new Employee(3,"Pack","Health",3452,23));
		eList.add(new Employee(6,"Hack","Games",23433,24));
		eList.add(new Employee(5,"Kack","School",9876,27));
		eList.add(new Employee(8,"Sack","IT",9872,21));
		eList.add(new Employee(4,"Lack","Management",23496,54));

		//eList.stream().map(e->e.getName()).forEach(System.out::println);
		//eList.stream().filter(e->e.getSalary()>4000).map(e->e.getName()).sorted().forEach(System.out::println);
		
		int max = eList.stream().map(e->e.getSalary()).max(Integer::compare).get();
		System.out.println("Max salary----"+max);
		
		//Collections.sort(eList,new AgeSorter());
		eList.stream().sorted(new AgeSorter()).forEach(System.out::println);
		eList.stream().sorted(new AgeSorter()).forEach(t->System.out.println(t));
		//System.out.println(eList);
		
		Comparator<Employee> nameSorter = (Employee o1, Employee o2) -> o1.getName().compareTo(o2.getName());
		eList.stream().sorted(nameSorter).forEach(e->System.out.println("name sorting ---"+e));
		
		Map<Integer, String> m = eList.stream().filter(e->e.getSalary()>2000)
				.filter(e->e.getDept().equals("IT")).collect(Collectors.toMap(e->e.getId(), e->e.getName()));
		
		System.out.println(m);
		
	}
	
	public static int square(int i) {
		System.out.println("I m in multiplication logic");
		return i*i;
	}
	
	public int cube(int i) {
		return i*i*i;
	}
	public static int sum(int i) {
		return i+i;
	}
	public static int test(int i) {
		return i*i+i;
	}

}
