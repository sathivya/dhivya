package project;
import java.util.Scanner;
public class string {
	public static void main(String[] args) {
		System.out.println("enter the string");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		String s2="";
		for(int i=str.length()-1;i>=0;i--)
		{
			s2=s2+str.charAt(i);
		}
	    System.out.println(s2);
	    String s3=s2.replaceAll("[aeiouAEIOU]","");
		System.out.println(s3);
	    
	}

}
