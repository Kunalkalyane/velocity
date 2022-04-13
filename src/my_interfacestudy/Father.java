package my_interfacestudy;

public interface Father {
	void money();
	void rules();
	 default void love()
	{
		System.out.println("FATHER'S LOVE");
	}
	static void emotion()
	{
		System.out.println("Father's emotion");
	}
}
