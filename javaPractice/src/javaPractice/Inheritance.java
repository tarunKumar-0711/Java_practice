package javaPractice;
class Bonami{
	String eName;
	int salary;
	int skillsNo;
	int skillGained;
	
	public Bonami(String name,int skillsNo, int skillGained,int salary) {
		this.eName=name;
		this.skillsNo=skillsNo;
		this.skillGained=skillGained;
		this.salary=salary;
	}
	
	public int totalSkills() {
		return (skillsNo+skillGained);
	}
	
	public String toString() {
		return "Employee Name "+ eName +"\nSalary "+ salary + "\nNumber of Initial skills "+skillsNo
				+"\nSkills Gained "+skillGained+"\nTotal Skills "+totalSkills();
	}
	
}
class Employee extends Bonami{
	String address;
	
	public Employee(String name,int skillsNo, int skillGained,int salary, String adr) {
		super(name, skillsNo, skillGained,salary);
		this.address=adr;	
	}
	
	@Override public String toString() {
		return super.toString() + "\nAddress: "+ address;
	}
}
public class Inheritance {

	public static void main(String args[]) {
		Employee var = new Employee("Var",3,2,500,"Ghaziabad");
		System.out.println(var.toString());
	}
}
