package Variable_datatypes;

public class Global_variable {
	int a=20;
	static int b=46;

	
	public static void main(String[] args) {
		
		Global_variable gv =new Global_variable();
		System.out.println("THE VALUE OF A IS "+gv.a);
		System.out.println("\"THE VALUE OF B IS "+b);
			gv.sample();
			sample11();
			
	


	}

	
	public void sample()
	{
		int c=40;
	  int d =45;
	   int sum =a+d;
	   int diff = a-c;
	   int mult =b*c;
	   int div =b/d;
	   System.out.println("THE ADDITION OF THE TWO NUMBER IS "+sum);
	   System.out.println("THE SUBSTTRACTION OF THE TWO NUMBER IS "+diff);
	   System.out.println("THE MULTIPLICATION OF THE TWO NUMBER IS "+mult);
	   System.out.println("THE DIVISION OF THE TWO NUMBER IS "+div);
	   }
	


public static void sample11() {
	int c=30;
	int d=76;
	 int mult =d*b;
	   System.out.println("THE MULTIPLICATION  OF THE TWO NUMBER IS "+mult);

	
	
	
}
}
