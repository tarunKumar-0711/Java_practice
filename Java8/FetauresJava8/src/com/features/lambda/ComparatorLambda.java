package com.features.lambda;
import java.util.Comparator;


public class ComparatorLambda {
	
	public static void main(String args[]) {
		
	
		Comparator<Integer> c1 = (Integer x,Integer y) -> x.compareTo(y);
		System.out.println(c1.compare(2,4));
		
		Comparator<Integer> c2 = (x,y) -> x.compareTo(y);
		System.out.println(c2.compare(2,4));
		
		
		Comparator<Integer> c3 = new Comparator<Integer>() {
			@Override
			public int compare(Integer x,Integer y) {
				return x.compareTo(y);
			}
		};
		
		//System.out.println(c3.compare(2, 3));
		
	}
}
