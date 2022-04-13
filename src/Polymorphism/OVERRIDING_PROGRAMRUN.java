package Polymorphism;

public class OVERRIDING_PROGRAMRUN {

	public static void main(String[] args) {
		System.out.println("----------------------------------");

		FATHER F=new FATHER();
		F.money();
		F.respect();
		System.out.println("----------------------------------");
		Son s=new Son();
		s.money();
		s.respect();
		System.out.println("----------------------------------");
		s.property();
		


	}

		
	
}
