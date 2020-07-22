package org;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Dict {
	
	public static void main(String[] args) {
	List<String> words=new ArrayList();
	words.add("a");
	words.add("and");
	words.add("another");
	List<String> dr=new ArrayList<>();
	//Creating the stream of all names
		Stream<String> allNames = words.stream();
			
		Stream<String> names = (Stream<String>) allNames.filter(str -> str.startsWith("a")).collect(Collectors.toList());
		
		 names.forEach(System.out::println); 
	}

}
