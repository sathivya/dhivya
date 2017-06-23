package guvi;
import java.util.Scanner;
import java.util.Arrays;
public class hunter128 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int max=0;
		int min=100;
		int temp=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println(a[n-1]+" "+" "+a[0]);// for printing the max and min value first
		
		Arrays.sort(a);
		for(int i=1;i<a.length-1;i++)
		{
         System.out.println(a[i]);
			
		}
		
	}
}



