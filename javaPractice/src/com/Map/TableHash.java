package com.Map;

import java.util.Hashtable;
class Temp{
	int i;
	
	public Temp(int i) {
		this.i=i;
	}
	public int hashcode() {
		return i%11;
	}
	public String toString() {
		return i+" ";
	}
}

public class TableHash {
	
	public static void main(String[] args){
		Hashtable ht = new Hashtable();
		Temp obj = new Temp(20);
		ht.put(new Temp(10),"A");
		ht.put(new Temp(14),"R");
		ht.put(new Temp(13),"K");
		ht.put(obj,"E");
		System.out.println(ht);
		System.out.println(obj.hashcode());
	}
}
