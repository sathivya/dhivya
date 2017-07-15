package guvi;
import java.util.Scanner;
public class hunter115 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int l1=s1.length();
		int l2=s2.length();
		String s3=" ";
		String s5=" ";
		if(l1==l2)
		{
			System.out.println(s1.concat(s2));
		}
		if(l1>l2)
		{
			for(int i=0;i<l2;i++)
			{
				s3=s3+s1.charAt(i)+s2.charAt(i);
			}
			 int j=1;
			 for(int i=l2;i<l1;i++)
			 {
				 s3=s3+s1.charAt(i)+j;
			}
			}
			else if(l2>l1)
			{
				for(int i=0;i<l1;i++)
				{
					s3=s3+s1.charAt(i)+s2.charAt(i);
				}
				 int j=1;
				 for(int i=l1;i<l2;i++)
				 {
					 s3=s3+s1.charAt(i)+j;
				}
				}
				System.out.println(s3);
		}
		
		
	}


