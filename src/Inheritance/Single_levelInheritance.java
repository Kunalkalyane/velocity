package Inheritance;

public class Single_levelInheritance {

	public static void main(String[] args) {
		DAUGHTER du =new DAUGHTER();
		System.out.println("==========================");

		du.look();
		du.money();
		MOTHER.nature();
		du.mobile();
		du.scooty();
		System.out.println("==========================");
		
		System.out.println("==========================");

		SON S=new SON();
		S.money();
		S.look();
		MOTHER.nature();
		S.experience();
		S.bike();
		S.laptop();
		S.car();
		System.out.println("==========================");


		
	}

}
