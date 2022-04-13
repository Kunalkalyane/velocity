package Casting;

public class Casting1 {

	public static void main(String[] args) {
		int a=10;////implicit casting lower--> higher
		System.out.println("print the value of a in an implicit casting "+a);
		double b;
		b=a;
		System.out.println("print the value of b in an implicit casting "+b);

		double c=100.2365;//explicit casting higher--> lower
		System.out.println("print the value of c in an explicit casting "+c);
		
		int d=(int) c;
		System.out.println("print the value of d in an explicit casting "+d);
	}

}
/*
CASTING

Converting one type of information into another type is called casting 
	1. primitive casting
		2. non-primitive casting
	
1. Primitive-casting:
Converting one data type of information into another data type is called primitive-casting is classified into 3 types:
	1. implicit casting
	2. explicit casting
	3. boolean casting
*/