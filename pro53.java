package guvi;
import java.util.Scanner;
public class pro53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		int count=0;
		for(int i=0;i<s1.length();i++)
		{
			
			char ch=s1.charAt(i);
			if(ch>='A'&&ch<='Z'||ch>='a'&&ch<='z')
			{
				count=count+1;
			}
		}
		
				if(count==26)
				{
					System.out.println("it is panagram");
					
				}
		
				else
				{
					System.out.println("it is not panagram");
				}
	}
}
	

	
