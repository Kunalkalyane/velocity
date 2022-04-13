package methods;
import java.util.Scanner;

public class Example6 {

	public void test5() {
		System.out.println("THIS IS THE TEST5 BY NONSTATIC METHOD");
		Scanner sc= new Scanner(System.in);

		float ferenite,celcius ;
		System.out.println("Enter THE VALUE OF CELCIUS ");
		celcius=sc.nextFloat();
		
		ferenite=((celcius*9/5)+32);
		System.out.println("TEMPRETURE OF FERENITE IS "+ferenite);
		
		
		
	}
	
	
	
	public static void main(String[] args) {
System.out.println("THIS IS MAIN METHOD HEADING ");
Scanner sc= new Scanner(System.in);

Example6 e7 =new Example6();
e7.test5();
Sample5 e2 =new Sample5();
e2.test7();
e2.test8();
test4();
Main_variable.test1();
Main_variable.test2();
sc.close();

	}

	
	public static void test4() {
		System.out.println("THIS IS STATIC METHOD FOR TEST4");
		Scanner sc =new Scanner(System.in);
		int a,b;
		float mult;
		System.out.println("ENTER THE VALUE  OF A ");
		a =sc.nextInt();
		System.out.println("ENTER THE VALUE  OF B ");
		b=sc.nextInt();
		mult=a*b;
		System.out.println("MULTIPLICATION IS "+mult);

		
		
	}
}
