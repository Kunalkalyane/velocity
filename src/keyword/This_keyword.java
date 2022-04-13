package keyword;

public class This_keyword {
	int a=1111;
	static int b =20;
	static int c=30;
	

	public static void main(String[] args) {
		This_keyword k=new This_keyword();
		System.out.println("======================================================================");
		k.test1();
		System.out.println("======================================================================");
		k.test2();
		System.out.println("======================================================================");
	}

	public void test1()
	{
		int a=10;
		int b=35;
		 int sum=a+b;
		 int sum1=100+a;
		 int sum2=100+this.a;
		System.out.println("The value of sum  "+sum);
		System.out.println("The value of sum  of local variable "+sum1);

		System.out.println("This is value of sum of this variable "+sum2);
	}
	
	public void test2() {
		int b=37;
		int a=90;
		 int diff =a-b;
		  int diff1=100-b;
		  int diff2=100-this.b;
		  System.out.println("this is the value of difference of two no "+diff);
		  System.out.println("this is the value of difference of 100 and  localb is "+diff1);
		  System.out.println("this is the value of difference of 100-global b is "+diff2);
	}
	
	public static void test3()
	{
		int a=11;
		int b=22;
		int c=33;
		int sum=100+a;
		int sum1=100+b;
		int sum2=100+c;
		System.out.println("======================================================================");
		
		//  sum4= 100+this.a;//we can't use this keyword in static method
		// sum5=100+this.b;//we can't use this keyword in static method
		// sum6=100+this.c;//we can't use this keyword in static method
		
	}
}
