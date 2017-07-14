package guvi;
import java.util.Scanner;
public class hunter69 {

	public static void main(String[] args) {
		 Scanner s=new Scanner(System.in);
		String s1=s.next();
		char[]c=s1.toCharArray();
		char ch;
		int r=0,r1=0,r3=0,r4=0;
		int max=0,min;
		int temp=0;
		int mul=1,sum=0,mul1=1,sum1=0,sum3=0,sum4=0;
		String s2="";
		for(int i=0;i<s1.length();i++)
		{
			ch=s1.charAt(i);
			if(Character.isDigit(ch))
			{
				s2+=ch;
			}
		}
		int n=Integer.parseInt(s2);
		int k=n;
		int m=n%10;
		min=m;
		while(n>0)
		{
		
			r=n%10;
			if(r>max)
			{
				max=r;
			}
		
			else if(min>r)
			{
				min=r;
			}
			n=n/10;
			}
	
				//System.out.println(max);
				//System.out.println(min);
				while(k!=0)
				{
					sum=0;
			        r1=k%10;
					mul=max*r1;
					sum=sum+mul;
					sum1=min+r1;
					mul1=mul1*sum1;
					sum1=sum1+mul1;
					k=k/10;
				}
				//System.out.println(mul1);
				int sum5=0;
				sum5=sum;
				while(sum>=10 && mul1>=10)
				{
					sum3=0;
					sum4=0;
					while(sum!=0 && mul1!=0)
					{
		
						
						r3=sum%10;
						sum3=sum3+r3;
						sum=sum/10;
				
					}
					sum=sum3;
				}
					while(mul1>=10)
					{
						sum4=0;
						while(mul1!=0)
						{
							r4=mul1%10;
							sum4=sum4+r4;
							mul1=mul1/10;
						}
						mul1=sum4;
				}
				int g=0;
				if(sum3<sum4)
				{
			
					g=sum3;
				}
				else
				{
					g=sum4;
				}
				System.out.println(g*g);
				
			
		}
}
	


