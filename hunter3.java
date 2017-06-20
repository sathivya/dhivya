package guvi;
import java.util.Scanner;
public class hunter3 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter the size");
		int n=s.nextInt();
		int a[]=new int[n];
		System.out.println("enter the size");
		int s1=s.nextInt();
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==s1)
			{
				System.out.println(a[i]+"equals"+ s1);
			}
		}
		

	}

}
