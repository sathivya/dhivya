package project;
import java.util.Scanner;
public class Holiday {
	public static void main(String[]args)
	{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the day");
	String str=s.next();
	String str1="sunday";
			if(str.equals(str1))
				System.out.println(false);
			else
				System.out.println(true);
}
}
