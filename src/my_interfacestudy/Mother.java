package my_interfacestudy;

public interface Mother {
	void nature();
	 default void love() {
		System.out.println("MOTHER'S LOVE");
	}
	
	static void emotion()
	{
		System.out.println("Mother's emotion");
	}
	

}
