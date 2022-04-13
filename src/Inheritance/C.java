package Inheritance;

public class C  extends A {

	public static void main(String[] args) {
		C g =new  C();
		System.out.println("==================");
	
		g.rank();
		g.grade();
		g.subject();
		System.out.println("==================");
		System.out.println("==================");

		g.test();
		test1();
		System.out.println("==================");

	}


public void test()
{

	System.out.println("C's non static method ");
}
public static void test1()
{
	System.out.println("C's static method ");

}

}
