package guvi;
import java.util.Scanner;
public class pro62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int temp=0;
		String f="";
		StringBuffer a=new StringBuffer(s1);
		char ch,ch1;
		for(int i=0;i<s1.length();i++)
		{
			for(int j=i+1;j<s1.length();j++)
			{
				StringBuffer b=new StringBuffer(s1.substring(i,j));
				String c=s1.substring(i,j);
				String d=b.reverse().toString();
				if(c.equals(d))
						{
					int max=c.length();
					if(max>temp)
					{
						temp=max;
						
					
					f=d;
						}
						}
				}
			}
		System.out.println(f);
				
		}
	}
				