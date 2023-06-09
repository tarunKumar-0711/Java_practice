package com.IOJava;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class Task {
	public static void main(String[] args) {
		PrintWriter pw = null;
		PrintWriter pw1 = null;
		BufferedReader br = null;
		try {
//		try(
//			PrintWriter pw = new PrintWriter("/home/ctp/eclipse-workspace/javaPractice/src/com/IOJava/FirstName.txt");
//			PrintWriter pw1 = new PrintWriter("/home/ctp/eclipse-workspace/javaPractice/src/com/IOJava/LastName.txt");
//			BufferedReader br = new BufferedReader(new FileReader("/home/ctp/eclipse-workspace/javaPractice/src/com/IOJava/Z.txt"));
//			){
			pw = new PrintWriter("/home/ctp/eclipse-workspace/javaPractice/src/com/IOJava/FirstName.txt");
			pw1 = new PrintWriter("/home/ctp/eclipse-workspace/javaPractice/src/com/IOJava/LastName.txt");
			br = new BufferedReader(new FileReader("/home/ctp/eclipse-workspace/javaPractice/src/com/IOJava/Z.txt"));
			String line = br.readLine();
		
			while(line !=null) {
				String[] vals = line.split(" ");
				pw.println(vals[0]);
				pw1.println(vals[1]);
				line=br.readLine();
			}
		}
		catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		finally {
			System.out.println("Finally Executes");
			if(pw != null) {
				pw.flush();
				pw.close();
			}
			if(pw1 !=null) {
				pw1.flush();
				pw1.close();
			}
			if(br != null) {
				try {
					br.close();
				} catch (IOException e2) {
					System.out.println(e2);
					e2.printStackTrace();
				}
			}
		}
	}
}
