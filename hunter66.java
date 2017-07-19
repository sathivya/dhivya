package guvi;
import java.util.Scanner;
public class hunter66 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String[]input=new String[n];
		String s2="10";
		String s3="01";
		int count=0;
		for(int i=0;i<n;i++)
        {
	          input[i]=s.next();
         }
		for(int i=0;i<n;i++)
		{
			if(input[i].length()>2)
			{
			String s4=input[i].substring(0,2);
			if(s4.equals(s2)||(s4.equals(s3)))
			{
				count=count+1;
			}
		}
		}
		System.out.println(count);
	}

}
