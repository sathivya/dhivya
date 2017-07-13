package guvi;
import java.util.Scanner;
public class hunter127 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int flag=0;
		int count=0;
		int count1=0;
		for(int i=2;i<n;i++)
		{
			flag=0;
			for(int j=2;j<i/2;j++)
			{
				if(i%j==0)
				{
					flag=1;
				break;
				}
			}
			if(flag==0)
			{
				System.out.println(i);
	         if(i==3)
				{
					count=count+1;
				}
				 if(i>=10)
				{
				int r=i%10;
				if(r==3)
				{
					count=count+1;
				}
			}
		}
		}
		System.out.println("the count of digit 3 is"+count);
		}
	}

