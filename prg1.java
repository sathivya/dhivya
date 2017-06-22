package string;
import java.util.Scanner;
public class prg1 {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the first string");
		String str=s.next();
		StringBuffer str1=new StringBuffer(str);
		str1.reverse();
		if(str.equals(str1))
		{
			System.out.println("it is palindrome");
		}
		else
		{
			System.out.println("it is not palindrome");
		}
	}
}