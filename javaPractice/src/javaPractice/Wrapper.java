package javaPractice;
class Minimum{
	int min=9999999;
	int size=0;
	
	public Minimum() {}
	public void insert(int x) {
		if(x>min)
			return;
		else
			min=x;
		size++;
	}
	
	
	public void print() {
		System.out.println("Minimum number is "+min+"\nTotal elements added "+size);
	}
		
	
}
public class Wrapper {
	public static void main(String args[]) {
		Minimum x = new Minimum();
		x.insert(34);
		x.insert(42);
		x.insert(2);
		x.print();
	}
}
