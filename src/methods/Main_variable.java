package methods;

public class Main_variable {
	public static void test1(){
		System.out.println("THIS IS STATIC VARIABLE METHOD");
		int a,b,sum;
		a=30;
		b=20;
		
		System.out.println("THE VALUE OF A "+a);
		System.out.println("THE VALUE  OF B "+b);
		sum=a+b;  
		System.out.println("THE SUM IS "+sum);
	}

	public static void main(String[] args) {
System.out.println("THIS IS MAIN METHOD ");
int g,h, multiplication;
g=25;
h=45;
System.out.println("THE VALUE OF G IS "+g);
System.out.println("THE VALUE OF H IS "+h);
multiplication =g*h;
System.out.println("THE MULTIPLICATION IS "+multiplication);

int k,l,division;
k=1000;
l=25;
System.out.println("THE VALUE OF K IS "+k);
System.out.println("THE VALUE OF L IS "+l);
division =k/l;
System.out.println("THE DIVISION IS "+division);
test1();
test2();
}

	public static void test2() {
		System.out.println("THIS IS STATIC VARIABLE METHOD TEST2 ");
		int c,d,difference;
		c=60;
		d=50;
		System.out.println("THE VALUE OF C IS "+c);
		System.out.println("THE  VALUE OF D IS "+d);
		difference =c-d;
		System.out.println("THE DIFFERENCE IS "+difference);
			
	}
}
