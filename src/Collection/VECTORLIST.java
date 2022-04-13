package Collection;

import java.util.Enumeration;
import java.util.Vector;

public class VECTORLIST {

	public static void main(String[] args) {
		Vector v=new Vector();
		v.add("RUSSIA");
		v.add(100.456);
		v.add('W');
		v.add(null);
		v.add("UKRAINE");
		v.add('X');
		v.add('Y');
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		v.add("UKRAINE");
		v.add(0,"HAVE A NICE DAY");
		System.out.println(v);
		v.remove(0);
		System.out.println(v);
		System.out.println(v.contains('X'));
		System.out.println(v.contains('Y'));
		System.out.println(v.isEmpty());
		System.out.println(v.get(5));
		
		
		Enumeration en=v.elements();
		while( en.hasMoreElements()) {
			System.out.println(en.nextElement());
			
		}
	
		

	}

}
