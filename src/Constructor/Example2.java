package Constructor;

public class Example2 {
	public Example2() {
		System.out.println("THIS  OUTPUT IS USER DEFINED CONSSTRUCTOR");
		System.out.println("Running zero parameter constructor");
	}

	public static void main(String[] args) {
		 Example2 d =new Example2();
		 d.test9();

	}
public void test9() {
	int a,b,sum;
	a=40;
	b=45;
	sum=a+b;
	System.out.println("THE SUM IS "+sum);
	
}
}
