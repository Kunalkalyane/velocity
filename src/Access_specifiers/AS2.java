package Access_specifiers;

public class AS2 {

	public static void main(String[] args) {
		AS1 S1=new AS1();
		S1.test1();
		S1.test2();
		S1.test3();
		//S1.test4();private method is not visible in another class
		
		System.out.println("this is non static default  global variable of class AS1 "+S1.a);
		System.out.println("this is non static public  global variable of class AS1 "+S1.b);
		System.out.println("this is non static protected global variable of class AS1 "+S1.c);
		//System.out.println("this is non static private  global variable of class AS1 "+S1.d);//private members of AS1 class is not possible in another class




	}

}

