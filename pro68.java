package guvi;
import java.util.Scanner;
public class pro68 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String s1=s.next();
        String s2=s.next();
        String s3=" ";
        String s4=" ";
        int p=0,q=0;
		int pin=s.nextInt();
		int n=s.nextInt();
		int k=n;
		int l1=s1.length();
		int l2=s2.length();
		int high=0,small=0;
	   if(l1>l2)
	    {
		   s3=s3+s1.charAt(0);
		    s4=s4+s3.concat(s2);
	   }
	 
	   String str=String.valueOf(pin);
	   String str3=str;
	   StringBuffer str1=new StringBuffer(str);
	   str1.reverse().toString();
	   String str2=" ";
	   str2=str2+str1;
	  char ch = 0,ch1=0;
        for(int i=1;i<=str.length();i++)
        {
        	if((n-1)==i)
        	{
        		ch=str.charAt(i);
        	}
        }
        for(int j=1;j<=str2.length();j++)
        {
        	if(j==n)
        	{
        		ch1=str2.charAt(j);
        	}
        }
        	System.out.println(s4+ch+ch1);
        
        
	}

}
