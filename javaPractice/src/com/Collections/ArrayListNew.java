package com.Collections;
import java.util.*;

public class ArrayListNew {
	public static void main(String args[]) {
		List<Integer> lst = new ArrayList<>();
		lst.add(1);
		lst.add(2);
		lst.add(57);
		lst.add(38);
		lst.add(7);
		lst.add(0);
		System.out.println(lst);
		lst.add(4,80);
		System.out.println(lst);
		lst.set(2, 30);
		System.out.println(lst);
		lst.remove(Integer.valueOf(38));//For passing object
		lst.remove(3);
		System.out.println(lst);
		System.out.println(lst.get(3));
		System.out.println(lst.indexOf(80));
		System.out.println(lst.contains(80));
		Iterator<Integer> itr = lst.iterator();
		while(itr.hasNext()) {
			itr.next();
			//System.out.println(itr.next() );
			System.out.println(itr);
		}
	}
}
