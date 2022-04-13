package ARRAY;

public class Threeby3 {

	public static void main(String[] args) {
		int a1[][]= {{123,456,789},{456,789,123},{789,123,456}};
		System.out.println("==================================================");

		for (int i=0;i<=a1.length-1;i++)
		{
			for(int j=0;j<=a1.length-1;j++)
			{
				System.out.print(a1[i][j]+" ");
			}
			System.out.println();
		
				
		}
		System.out.println("==================================================");
		test();
		System.out.println("==================================================");

	}
	public  static void test() {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	}


