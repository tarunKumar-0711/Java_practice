package com.Exception.Handling;

public class IterableHandling {
	public static int divideByZero(int a, int b) {
		
		int res = a/b;
		
		return res;
	}
	public static int computeDivision(int a,int b) {
		
		int res =0;
		try {
			res= divideByZero(a,b);
		}
		catch(NumberFormatException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return res;
	}
	public static void main(String args[]) {
		int a=2,b=0;
		
		try {
			int res = computeDivision(a,b);
		}
		catch(ArithmeticException e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
