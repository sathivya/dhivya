package guvi;
import java.util.Scanner;
public class hunter123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2 =" ";
		int l1=s1.length();
		for(int i=0;i<l1;i++)
		{
			char ch=s1.charAt(i);
			for(int j=i+1;j<l1;j++)
			{
				if(ch==s1.charAt(j))
				{
					s2=s2+ch;
					
				}
			}
		}
	
	System.out.println(s2);

	}

}
