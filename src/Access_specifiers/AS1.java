package Access_specifiers;

public class AS1 {
	int a=10;
	public int b=20;
	protected int c=30;
	private int d=40;


	public static void main(String[] args) {
		AS1 s1=new AS1();
		s1.test1();
		s1.test2();
		s1.test3();
		s1.test4();
		
		System.out.println("this is non static default  global variable of class AS1 "+s1.a);
		System.out.println("this is non static public  global variable of class AS1 "+s1.b);
		System.out.println("this is non static protected  global variable of class AS1 "+s1.c);
		System.out.println("this is non static private  global variable of class AS1 "+s1.d);



		

	}
	public void test1() {
		System.out.println("THIS IS NON STATIC PUBLIC METHOD OF CLASS AS1");
	}
	void test2() {
		System.out.println("THIS IS NON STATIC  DEFAULT METHOD OF CLASS AS1 ");
	}
	protected void test3() {
		System.out.println("THIS IS NON STATIC PROTECTED METHOD OF CLASS AS1 ");
	}
	private void test4() {
		System.out.println("THIS IS NON STATIC PRIVATE METHOD OF CLASS AS1");
	}

}
