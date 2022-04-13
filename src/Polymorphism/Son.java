package Polymorphism;

public class Son extends FATHER {
	public static void main(String[] args) {
		Son n=new Son();
		n.money();
		n.respect();
		n.property();
		
	}
	public void money()
	{
		System.out.println("Son's money is 50k");
	}
	public void respect()
	{
		System.out.println("Son's respect");
	}

}
