package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class hunter12 {
	public static void amin(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
			a[i]=s.nextInt();
		}
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			if(i==6)
				System.out.println(a[i]);
		}
		int k=s.nextInt();
		System.out.println("enterr the k value");
		for(int i=0;i<n;i++)
		{
		if(k==a[i])
		{
			System.out.println(a[i]);
		}
		}
}
}