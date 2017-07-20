package guvi;
import java.util.Scanner;
public class email {
public static void main(String[] args){
	Scanner s=new Scanner(System.in);
	int flag=0;
	String s1=s.next();
		int index=s1.indexOf("@");
		int index1=s1.indexOf(".");
		String s2=s1.substring(index,index1);
		int len=s2.length();
		String s3=s1.substring(0,index);
		int len1=s3.length();
		String s4=s1.substring(s1.length()-4);
		if(s1.contains("@")&&(s1.contains("."))&&(len==4&&len>=3 && s4.equals(".com")));
		  {
				flag=flag+1;
		  }
		  if(flag==1)
			{
				System.out.println("it is   a valid email");
			}
		  else 
		  {
			  System.out.println("it is   not a valid email");
		  }
		  
}
}
