package dhivyaguvi;
import java.util.Scanner;
public class hunter56 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=s.nextInt();
		int temp=0;
		int temp1=0;
		int a[]=new int[n];
		System.out.println("enter the array elements");
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
			 if(a[i]!=a[j] &&i!=j)
			 {
				if(a[i]+a[j]<0)
				{
					temp=a[i];
				   temp1=a[j];
				}
				}
			}
		}
		
		System.out.println(temp+" "+temp1);
	}

}
