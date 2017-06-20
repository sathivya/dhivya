package guvi;
import java.util.Scanner;
public class hunter1 {
public static void main(String[]args){
	Scanner s=new Scanner(System.in);
    int n=s.nextInt();
	int a[]=new int[n];
	System.out.println("enter the array elements");
	for(int i=0;i<n;i++)
	{
		a[i]=s.nextInt();
	}
	for(int i=0;i<n;i++)
	{
		if(a[i]==a[i+1])
		{
			System.out.println(a[i]);
		}
	}
}
}
