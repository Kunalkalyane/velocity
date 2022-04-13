package keyword;

public class Extraclass_superkeyword extends Super_keyword{
	int  a=10;
	 static int b=20;
	int c=30;
	


	public static void main(String[] args) {
		Extraclass_superkeyword j=new Extraclass_superkeyword();
		System.out.println("======================================================================");
		
		j.test6();
		System.out.println("======================================================================");
		
		j.test9();
		System.out.println("======================================================================");
		

	}
	public void test6()
	{
		int a=1000;
		int b=2000;
		int c=3000;
		int sum=100+a;
		int sum1=100+b;
		int sum2=100+c;
		
		int sum3=100+this.a;
		int sum4=100+this.b;
		int sum5=100+this.c;
		
		int sum6=100+super.a;
		int sum7=100+super.b;
		int sum8=100+super.c;
		
		System.out.println("this is sum of local variable "+sum);
		System.out.println("this is sum of local variable "+sum1);
		System.out.println("this is sum of local variable "+sum2);
		System.out.println("======================================================================");
		
		System.out.println("this is sum of local global variable "+sum3);
		System.out.println("this is sum of local global variable "+sum4);
		System.out.println("this is sum of local global variable "+sum5);
		System.out.println("======================================================================");
		
		System.out.println("this is sum of super class global variable "+sum6);
		System.out.println("this is sum of super class global variable "+sum7);
		System.out.println("this is sum of super class global variable "+sum8);
		System.out.println("======================================================================");
		








}
	
	
	
	
}