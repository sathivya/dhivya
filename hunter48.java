package guvi;
import java.util.Scanner;
public class hunter48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		String s2=s.next();
		int n;
		if(s1.contains(s2))
		{
			n=s1.indexOf(s2);
			System.out.println(n);
		}else
		{
		   System.out.println(-1);
		}
	

	}

}
