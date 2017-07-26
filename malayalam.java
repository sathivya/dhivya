package guvi;
import java.util.Scanner;
public class malayalam {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
	String s1=s.next();
	char ch;
	char ch1;
	for(int i=0;i<s1.length();i++)
	{
		ch=s1.charAt(i); 
		for(int j=i+1;j<s1.length();j++)
		{
			ch1=s1.charAt(j);
			if(ch==ch1)
			{
				String s2=s1.substring(i,j+1);
				//System.out.println(s2);
				StringBuffer s3=new StringBuffer(s2);
				String s4=s3.reverse().toString();
				//System.out.println(s4);
				if(s4.equals(s2))
				{
					System.out.println(s2);
				}
			}
		}
	}

}
}
