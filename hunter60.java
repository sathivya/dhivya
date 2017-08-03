package guvi;
import java.util.Scanner;
public class hunter60 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a[]={1,2,3,4,5,6,7};
		int b[]={4,5,6,7,1,2,3};
		int k=0;
		for(int i=0;i<a.length;i++)
				                 
		{
			if(b[0]==a[i])
			{
				k=i;
			}
				
		}
		System.out.println("the rotated value is"+k);
	}

}
