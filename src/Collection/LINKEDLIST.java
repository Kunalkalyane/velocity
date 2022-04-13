package Collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LINKEDLIST {

	public static void main(String[] args) {
		
		LinkedList ll=new LinkedList();
		ll.add("NANADED");
		ll.add(05.55);
		ll.add('K');
		ll.add(null);
		ll.add("MUGAT");
		ll.add('V');
		ll.add('V');
		ll.add(null);
		
		System.out.println(ll);
		System.out.println(ll.size());
		ll.add("MUGAT");
		ll.add(0,"HAVE A NICE DAY");
		System.out.println(ll);
		ll.remove(0);
		System.out.println(ll);
		System.out.println(ll.contains('M'));
		System.out.println(ll.contains('K'));
		System.out.println(ll.isEmpty());
		System.out.println(ll.get(5));
		
		System.out.println("=============Using LINKEDLIST Iterator================");

		Iterator it1= ll.iterator();
		while(it1.hasNext()) {
		
		System.out.println(it1.next());
		
		}
		System.out.println("=============Using LINKEDLIST ListIterator================");
		
		
		ListIterator litr=ll.listIterator();
		while(litr.hasNext()) {
			System.out.println(litr.next());
		}
		System.out.println("=============Using LINKEDLIST For loop================");

		
		for(int i=0;i<=ll.size()-1;i++) {
			System.out.println(ll.get(i));
		}
		System.out.println("=============Using LINKEDLIST For each loop================");

		
		for(Object o:ll) {
			System.out.println(o);
		}
	
		
		
		
		
		

	}

}
