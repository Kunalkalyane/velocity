package methods;

public class Call_by_another_class_staticmethod {
public static void test1() {
	System.out.println("THIS IS TEST1 BY REGULAR STATIC METHOD WITH ANOTHER CLASS");
}

public static void main(String[] args) {
      System.out.println("THIS IS THE MAIN METHOD");
      test1();
      test2();
      E1_for_call_for_another_class.test3();
      E1_for_call_for_another_class.test3();
      E1_for_call_for_another_class.test3();
      test1();
      test1();
      test1();
      test2();
      test2();
      test2();
      

	}


public static void test2() { 
	System.out.println("THIS IS TEST2 BY REGULAR STATIC METHOD WITH ANOTHER CLASS");

}
}