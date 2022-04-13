package ARRAY;
import java.util.Arrays;
public class A1 {

	public static void main(String[] args) {
		
		char alphanumeric[]=new char[10];
		alphanumeric[0]='A';
		alphanumeric[1]='E';
		alphanumeric[2]='I';
		alphanumeric[3]='O';
		alphanumeric[4]='U';
		alphanumeric[5]='J';
		alphanumeric[6]='K';
		alphanumeric[7]='R';
		alphanumeric[8]='S';
		alphanumeric[9]='P';
		
		
		/*for(int i=0;i<=5;i++)
		{
			System.out.println(alphanumeric[i]);
		}
		*/
		
		for(int i=0;i<=alphanumeric.length-1;i++)
		{
			System.out.println(alphanumeric[i]);
		}
		Arrays.sort(alphanumeric);
	System.out.println("=================AFTER SORTING=======================================================");
	for(int i=0;i<=alphanumeric.length-1;i++)
	{
		System.out.println(alphanumeric[i]);
	}

	System.out.println("=================AFTER DECENDING=======================================================");
	for(int i=alphanumeric.length-1;i>=0;i--)
	{
		System.out.println(alphanumeric[i]);
	
	}
	
	
	
	
	

}
}
