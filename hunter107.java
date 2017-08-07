package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class hunter107 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s2[]=s1.split(" ");
		Arrays.sort(s2);
		int n=s2.length;
		if(n>=200 && n<=5000)
		{
		for(int i=0;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		}

	}

}
