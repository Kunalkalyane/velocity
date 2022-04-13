package Test;

import Access_specifiers.AS1;

public class Sample extends AS1 {
	public static void main(String[] args) {

	AS1 s1=new AS1();
	s1.test1();
	
	Sample s=new Sample();
	s.test1();
	s.test3();
	//s.test2();//can't call default method in another package
	//s.test4();//can't call default method in another package
	System.out.println("this is non static public  global variable of class AS1 "+s.b);
	System.out.println("this is non static protected  global variable of class AS1 "+s.c);



}
}