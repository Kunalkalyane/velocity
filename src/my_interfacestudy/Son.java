package my_interfacestudy;

public class Son implements Father,Mother {

	public static void main(String[] args) {
		Son s=new Son();
		Father.emotion();
		Mother.emotion();
		s.courage();
		test1();
		s.money();
		s.nature();
		s.love();
		s.rules();
		

	}

	public void courage() {
		System.out.println("SON'S  courage class its own method ");
	}
	public static void test1() {
		System.out.println("son's class static method");
	}
	
	@Override
	public void nature() {
		System.out.println("nature method of mother's interface completed in son's implementation class");
	}

	@Override
	public void love() {
		System.out.println("love method of mother's completed in son's implementation class");
		Father.super.love();
		Mother.super.love();
		}

	@Override
	public void money() {
		System.out.println("money method of father's interface completed in son's implementation class");

	}

	@Override
	public void rules() {
		System.out.println("rules method of father's interface completed in son's implementation class");

	}



}
