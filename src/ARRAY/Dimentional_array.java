package ARRAY;

public class Dimentional_array {

	public static void main(String[] args) {
		char grade[][]= {{'a','b'},{'c','d'}};
		for(int i=0;i<=grade.length-1;i++)
		{
			for(int j=0;j<=grade.length-1;j++)
			{
				System.out.print(grade[i][j] + " ");
				
			}
			System.out.println(" ");
		}

	}

}
