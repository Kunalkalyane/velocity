package Abstract_class;

public abstract class Abstract {

	public static void main(String[] args) {
//we cant create object of the class in abstract class//
		test4();
		test5();
	}

	public void test1() {
		System.out.println("this is the  non static method of test1 ");
	}
	
	public void test2() {
		System.out.println("this the of non  static method of test2");
	}
	
	public  static void test4() {
		System.out.println("this is static method of test4 ");
	}
	
	public abstract void test3();
	
	public  static void test5() {
		System.out.println("This is the static method of test5");
	}
	
	public abstract void test6();
	
	public  abstract void test7();
	public  abstract void test8();
	public  abstract void test9();
	



}





