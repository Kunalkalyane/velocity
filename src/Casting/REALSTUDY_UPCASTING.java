package Casting;

public class REALSTUDY_UPCASTING {
	
	

	public static void main(String[] args) {
		System.out.println("==================================================");
	SON S=new SON();
	S.bike();
	S.car();
	S.degree();
	System.out.println("==================================================");
	FATHER F=new SON();
	F.bike();
	F.car();
	//F.degree(); new method of son is not supported for casting
	System.out.println("==================================================");
	}
	
}
/*Upcasting: Upcasting is the typecasting of a child object to a parent object.
Upcasting can be done implicitly.
Upcasting gives us the flexibility to access the parent class members 
but it is not possible to access all the child class members using this feature. */

