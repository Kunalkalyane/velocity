package Polymorphism;

public class OVERLOADING_CONCEPT {

	public void add()
	{
		int a=60;
		 int b=78;
		 int sum= a+b;
		 System.out.println("THE Sum of two digit is "+sum);
	}
	
	public void add(int a,int b)
	{
		int sum=a+b;
		 System.out.println("THE Sum of two digit is "+sum);

	
	}
	public void add(int a,int b,int c)
	{
		int sum= a+b+c;
		 System.out.println("THE Sum of three digit is "+sum);

	}
	
	public void add(float a,float b) {
		 float sum=a+b;
		 System.out.println("THE Sum of three digit is "+sum);
 
		 
	}
	public void add(float a,float b,float c) {
	float sum=a+b+c;
	 System.out.println("THE Sum of two digit is "+sum);

	}
}
							