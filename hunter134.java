package guvi;
import java.util.Scanner;
public class hunter134 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int n1=s.nextInt();
		int count=0;
		int d=0;
		for(int i=n+1;i<=n1;i++)
		{
			count=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					count=count+1;
					break;
				}
				else
				{
					count=count+1;
				}
				
			}
		}
	
			if(count==0)
			{
			System.out.println("they are coprime ");
		}
	else if(count>0)
	{
		System.out.println("they are not coprimes");
	}
		
	}
	}
	


