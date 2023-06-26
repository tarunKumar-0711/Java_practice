package com.features;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class UniqueList {
	public static void main(String args[]) {
		List<String> names = Arrays.asList("A","S","W","W","R","S");
		System.out.println(names);
		
		List<String> uniqueList = names.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList);
		
		
	}
}
