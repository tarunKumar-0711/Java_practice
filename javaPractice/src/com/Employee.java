package com;

public class Employee {
	private int ID;
	private String name;
	private int age;
	private static int nextId=1;
	
	public Employee(String name, int age){
		this.name=name;
		this.age=age;
		this.ID=nextId++;
	}
	public void show() {
		System.out.println("ID : "+ID+" name : "+name +" age : "+age);
	}
	public static void nextfreshID() {
		System.out.println("Next id is "+nextId);
	}
	public void finalize() {
		nextId--;
	}
}
