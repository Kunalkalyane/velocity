package my_interfacestudy;

public class Myclass_study implements INTERFACE2 {

	public static void main(String[] args) {
		Myclass_study y=new Myclass_study();
		y.m1();
		y.m2();
		y.m3();
		y.m4();

	}

	@Override
	public void m1() {
		System.out.println("m1 method interface 1 completed in Implementation class");
	}

	@Override
	public void m2() {
		System.out.println("m2 method interface 1 completed in Implementation class");
		
	}

	@Override
	public void m3() {
		System.out.println("m3 method interface 2 completed in Implementation class");
		
	}

	@Override
	public void m4() {
		System.out.println("m4 method interface 2 completed in Implementation class");
		
	}

}
