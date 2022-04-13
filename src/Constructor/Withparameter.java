package Constructor;

public class Withparameter {
	
	int a;//variable declaration
	int b;//variable declaration
	int c;//variable declarations
	
	public Withparameter() {
		a=5000;
		b=10000;
		c=15000;
		System.out.println("runnning zero parameter CONSTRUCTOR");
	}
	
	public Withparameter(int num1) {
		
		a=num1;
		System.out.println("THE VALUE OF A IS "+a);

		System.out.println("runnning with only one parameter CONSTRUCTOR");
		}
	
	public Withparameter(int num1,int num2) {
		a= num1;
		b= num2;
		System.out.println("THE VALUE OF A IS "+a);
		System.out.println("THE VALUE OF B IS "+b);
		System.out.println("runnning with only two parameter CONSTRUCTOR");
		}
	
	public Withparameter(int num1,int num2,int num3) {
		a= num1;
		b=num2;
		c=num3;
		System.out.println("THE VALUE OF A IS "+a);
		System.out.println("THE VALUE OF B IS "+b);
		System.out.println("THE VALUE OF C IS "+c);
		
		}
	

	
	 
	 

	public static void main(String[] args) {
		Withparameter c0 = new Withparameter();
		c0.test4();
		
		Withparameter c1= new Withparameter(3000);
		c1.test4();
		
		Withparameter c2=new Withparameter(15000,9000);
		c2.test4();
		
		Withparameter c3= new Withparameter(4000,8000,14000);
		c3.test4();
		
		}
	
	
	public void test4() {
		System.out.println("= ================================================");
		int  sum;
		sum=a+b+c;
		System.out.println("THE ADDITION OF THREE NUMBER IS "+sum);
		System.out.println("==================================================");

		
		
	}

}
