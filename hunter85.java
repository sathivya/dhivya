package guvi;
import java.util.Scanner;
public class hunter85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n1=0;
		int count=0;
		int n2=s.nextInt();
		int a[]=new int[n2];
		for(int i=n1;i<n2;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n2;i++)
		{
			if(a[i]==2)
			{
			count=count+1;	
			}
			if(a[i]%10==2)
			{
				count=count+1;
			}
		}
System.out.println(count);
	}

}
