package my_interfacestudy;

public class IMPLEMENTATION_CLASS implements I1  {

	public static void main(String[] args) {
		IMPLEMENTATION_CLASS i=new IMPLEMENTATION_CLASS();
		i.sample1();
		sample2();
		

		i.test1();
		i.test2();
		i.test3();
		i.test4();

	}

	public void sample1()
	{
		System.out.println("this is non static own method of implementation class");
	}
	public static void sample2() {
		System.out.println("this is static own method of implementation class");
		
	}
	@Override
	public void test1() {
		System.out.println("test1 of interfaceI1 is completed in IMPLEMENTATION class with extends keyword");	}

	@Override
	public void test2() {
		System.out.println("test2 of interfaceI1 is completed in IMPLEMENTATION class with extends keyword");
		
	}

	@Override
	public void test3() {
		System.out.println("test3 of interfaceI1 is completed in IMPLEMENTATION class with extends keyword");		
	}

	@Override
	public void test4() {
		System.out.println("test4 of interfaceI1 is completed in IMPLEMENTATION class with extends keyword");		
	}

}
