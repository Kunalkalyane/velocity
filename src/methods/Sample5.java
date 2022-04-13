package methods;
import java.util.Scanner;
public class Sample5 {


	public  static void main(String[] args) {
		Sample5 e6 = new Sample5();
		Scanner sc =new Scanner(System.in);
		e6.test7();
		e6.test8();
		Call_by_another_class_staticmethod.test1();
		Call_by_another_class_staticmethod.test2();
		E1_for_call_for_another_class.test3();
		sc.close();
	}
	public void test7() {
		System.out.println("test7");
		Scanner sc =new Scanner(System.in);
		int a,b;
		System.out.println("ENTER THE VALUE A ");
		a=sc.nextInt();
		System.out.println("ENTER THE VALUE B ");
		b=sc.nextInt();
		if(a>b) {
			System.out.println("a greater b ");
		}
		else if(a==b) {
			System.out.println("a equal b ");
		}
		else {
			System.out.println("b is greater");
			sc.close();
		}
	}

		
		
	

	
	public void test8() {
		
		System.out.println("test8");
		Scanner sc =new Scanner(System.in);
		int c,d;
		System.out.println("ENTER THE VALUE C ");
		c=sc.nextInt();
		System.out.println("ENTER THE VALUE D ");
		d=sc.nextInt();
		if(c>d) {
			System.out.println("c greater d ");
		}
		else if(c==d) {
			System.out.println("c equal d");
		}
		
		else {
			System.out.println("d is greater");
		
			sc.close();

	}
	
	
	}
}

