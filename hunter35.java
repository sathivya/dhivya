package guvi;
import java.util.Scanner;
public class hunter35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);	
		String s1=s.next();
		int n1=s1.length();
		int n2=n1/2;
		String s2=s1.substring(0,n2);
		String s3=s1.substring(n2,n1);
		if(s2.equals(s3))
		{
			System.out.println("they are double Strings");
		}
		else
		{
			System.out.println("they are not double strings");
		}

	}

}
