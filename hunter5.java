package guvi;
import java.util.Scanner;
public class hunter5 {
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		int a[]=new int[5];
		int count=0;
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
			if(a[i]!=a[j])
			{
				temp=a[j];
		
				
	
				System.out.println(temp);
			}
		}
	}

	}
}
