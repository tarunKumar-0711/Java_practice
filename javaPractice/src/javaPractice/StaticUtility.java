package javaPractice;
class Student{
	String name;
	int roll;
	
	static String uname;
	static int counter=0;

	
	
	public Student(String name) {
		this.name=name;
		this.roll= ++counter;
	}
	
	public static void setUname(String univ) {
		uname=univ;
	}
	
	public void displayInfo() {
		System.out.println("Name "+name);
		System.out.println("Roll No "+roll);
		System.out.println("University "+uname);
	}
}
public class StaticUtility {
	
//	String name;
//	int roll;
//	
//	static String uname;
//	static int counter=0;
//	
//	public static void setUname(String univ) {
//		uname=univ;
//	}
//	
//	public StaticUtility(String name) {
//		this.name=name;
//		this.roll =++counter;
//	}
//	
//	public void displayInfo() {
//		System.out.println(name);
//		System.out.println(roll);
//		System.out.println(uname);
//	}
	public static void main(String args[]) {
//		setUname("KIET");
//		StaticUtility tarun = new StaticUtility("Tarun");
//		tarun.displayInfo();
		
		Student.setUname("KIET");
		Student tarun = new Student("Tarun");
		tarun.displayInfo();
		
		
	}
}
