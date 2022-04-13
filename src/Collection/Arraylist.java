package Collection;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylist {

	public static void main(String[] args) {
		ArrayList A=new ArrayList<>();
		A.add("MUMBAI");
		A.add(01.11);
		A.add('A');
		A.add(null);
		A.add("Pune");
		A.add('B');
		A.add('B');
		A.add(null);
		
		System.out.println(A);
		System.out.println(A.size());
		A.add("pune");
		A.add(0,"HAVE A NICE DAY");
		System.out.println(A);
		A.remove(0);
		System.out.println(A);
		System.out.println(A.contains('c'));
		System.out.println(A.contains('B'));
		System.out.println(A.isEmpty());
		System.out.println(A.get(5));
		
		System.out.println("=============Using For loop================");
		for(int i=0;i<=A.size()-1;i++) {
			System.out.println(A.get(i));
			
		}
		
		System.out.println("=============Using Iterator================");

		Iterator it= A.iterator();
		while(it.hasNext()) {
		
		System.out.println(it.next());
		
		}
		
		System.out.println("=============Using For each loop================");

		for(Object o:A) {
			System.out.println(o);
		}
		
		ArrayList<Integer>in=new ArrayList<>();
		in.add(1);
		in.add(2);
		in.add(3);
		in.add(4);
		in.add(5);
		
		System.out.println(in);
		System.out.println("=============Using For each loop================");

		for(int i:in) {
			System.out.println(i);
			}
		System.out.println("=============Using Iterator================");

		Iterator<Integer>it1=in.iterator();
		while(it1.hasNext()) {
			System.out.println(it1.next());
		}
		
		
		
		

}
}
