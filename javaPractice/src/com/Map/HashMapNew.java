package com.Map;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

public class HashMapNew {
	public static void main(String args[]) {
		//IdentityHashMap map = new IdentityHashMap();
		WeakHashMap map = new WeakHashMap<>();
		//HashMap map = new HashMap();
		//LinkedHashMap map = new LinkedHashMap();

//		Integer i1 = new Integer(10);
//		Integer i2 = new Integer(10);
		map.put(null, "E");
//		map.put(i1, "A");
//		map.put(i2, "T");
		map.put(2,"bonami");
		map.put(4,"Cogni");
		map.put(1,"tarun");
		map.put(1,"Sourav");
		map.put(3,"Ce");
		//i1=null;
		System.out.println(map);
		Set set = map.keySet();
		Collection c = map.values();
		//System.out.println(set);
		//System.out.println(c);
		
		Set set2 = map.entrySet();
		Iterator itr = set2.iterator();
		//System.out.print("[ ");
		while(itr.hasNext()) {
			Map.Entry entry = (Map.Entry)itr.next();
			//System.out.println(entry.getKey() + " "+ entry.getValue());
			//System.out.print(itr.next() + ", ");
		}
		//System.out.println("]");
	}
}
