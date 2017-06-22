package guvi;
import java.util.Scanner;
public class hunter7 {
	public static void main(String[] args)
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		int a[]=new int[n];
		int temp=0;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
					temp=a[i];
			}
		}
			System.out.println(temp);
		
	}

}
