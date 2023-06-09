package com.Exception.Handling;

public class MyException extends Exception{
	private static int AccNo[] = {1,2,3,4,5};
	private static String name[] = {"A","B","C","D","E"};
	private static int bal[] = {3000,4500,2000,4000,200};
	
	public MyException() {}
	
	public MyException(String str) {
		super(str);
	}
	
	public static void main(String args[]) {
		System.out.println("Account Number      Name      Balance");
			for(int i =0;i<name.length;i++) {
				try {

					if(bal[i]<1000) {
						MyException obj = new MyException("Balance is less than 1000");
						throw obj;
					}
					
					System.out.println("   "+AccNo[i]+"                 "+name[i]+"        "+bal[i]);
				}
				
				catch(MyException e) {
					System.out.println(name[i]+ " Please Add Money");
					e.printStackTrace();
				}
				finally {
					System.out.println("   "+AccNo[i]+"                 "+name[i]+"        "+bal[i]);
				}
		}
		
	}
	
}
