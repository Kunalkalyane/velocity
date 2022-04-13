package Abstract_class;

public class Concrete_class extends Abstract{

	public static void main(String[] args) {
		Concrete_class c=new Concrete_class();
		
		c.test1();
		c.test2();
		c.test3();
		c.test6();
		c.test7();
		c.test8();
		c.test9();
		test10();
		c.test11();
		Abstract.test4();
		Abstract.test5();
		
		
		
		
		
		

	}

	@Override
	public void test3() {
		System.out.println("this is the  non static method of test3 ");
		
	}

	@Override
	public void test6() {
		System.out.println("this is the  non static method of test6 ");		
	}

	@Override
	public void test7() {
		System.out.println("this is the  non static method of test7 ");		
	}

	@Override
	public void test8() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void test9() {
		// TODO Auto-generated method stub
		
	}

	
	public static void test10() {
		System.out.println("this is the static method of concrete class of test10");
	}
	public void test11()
	{
		System.out.println("this is the non static method of concrete class of test11");
	}
	
	
}
