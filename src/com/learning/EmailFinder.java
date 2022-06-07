package com.learning;

import java.awt.Container;
import java.util.*;
import java.util.stream.Collectors;

public class EmailFinder {

	public static void main(String[] args) {
		//map and flatMap
		List<List<String>> input = new ArrayList<>();
		
		List<String> name = Arrays.asList("Sangeeta","Santosh","Kul","Kesar","jack","barsha","Arti");
		List<String> email = Arrays.asList("Sangeeta@gmail","Sangeeta@gmail","Santosh@test","Kul@gmail","Kesar@facebook","jack@Icici","barsha@gmail","Arti");
		List<String> dept = Arrays.asList("Sangeeta11","111Santosh","Kul423","Ke3434sar","j43r43ack","bafvfrsha","A44rti");
		input.add(name);
		input.add(email);
		input.add(dept);
		
		Set<String> gmail = input.stream().flatMap(List::stream).filter(e->e.contains("gmail")).collect(Collectors.toSet());
		System.out.println(gmail);
	}

}
