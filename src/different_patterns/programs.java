package different_patterns;

public class programs {

	public static void pyramidpattern(int n)
		// TODO Auto-generated method stub
{
for (int i=0;i<n;i++)// outer loop for number of rows(n)
{
for(int j=n-i;j>1;j--)//inner loop for spaces
{
	System.out.print("");//print space
	}
for(int j=0;j<=i;j++)//inner loops for number of coloumns
{
	System.out.print(+i);//print star
}
System.out.println();//ending line after each row
}
}
public static void main(String args[])//driver function
{
	int n=9;
	pyramidpattern(n);
}
}
