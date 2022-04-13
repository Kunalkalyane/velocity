package methods;

public class Example7 {
	
	public void addition() {
		int a,b,sum;
		a=30;
		b=20;
		System.out.println("THE VALUE OF A "+a);
		
		System.out.println(" THE VALUE OF B "+b);
	
		sum=a+b;
		System.out.println("THE Addition is "+sum);
	}
	
	public void addition1(int a, int b, int c) 
	{
		int sum =a+b+c;
		System.out.println("THE ADDITION IS "+sum);
	}

	public static void main(String[] args) {
		Example7 e2 = new Example7();
		System.out.println("=====================");
		e2.addition();
		System.out.println("=====================");
		System.out.println("=====================");
		e2.addition1(10,20,30);
		e2.addition1(40,50,60);
		System.out.println("=====================");
		e2.addition();
		System.out.println("=====================");
		studentinfo();
		Studentinfo1("Nanded",50,83.50f,'A');
		Studentinfo1("HELLO",45,33.33f,'B');
		Studentinfo1("MUMBAI",30,92.33f,'C');
		Studentinfo1("BANGLORE",96,64.37f,'D');
		Example6 e9=new Example6();
		e9.test5();
		e9.test4();
		




		

	}
	
	
	public static void studentinfo() {
		String  name="KISMAT CONNECTION";
		int rollno=90;
		char grade='A';
		 float weight=60.55f;
		 System.out.println("Name of the student "+name);
		 System.out.println("rollno is "+rollno);
		 System.out.println("grade is "+grade);
		 System.out.println("weight is "+weight);
		 
		
	}



	
	public static void Studentinfo1( String name, int rollno,float weight,char grade ) {
		System.out.println("=====================");

		System.out.println("THE NAME OF STUDENT IS "+name);
		System.out.println("THE ROLL NUMBER OF STUDENT IS "+rollno);
		System.out.println("THE WEIGHT OF STUDENT IS "+weight);
		System.out.println("THE GRADE OF STUDENT IS "+grade);
		
		System.out.println("=====================");



}
}
	
