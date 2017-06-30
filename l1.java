package logic;
import java.util.Scanner;
public class l1 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    int rem;
	    int rev=0;
	    int r1;
	    int sum1=0,sum2=0;
	    int temp=0;
	    while(n>0)
	    {
	    	rem=n%10;
	    	rev=rev*10+rem;
	    	n=n/10;
	    }
	    temp=temp+rev;
	    while(temp!=0)
	    {
	    	r1=temp%10;
	    	sum1=sum1+r1;
	    	sum2=sum2+sum1;
	        temp=temp/10;
	        
	    	
	    }
	    System.out.println(sum2);
		
	}

}
