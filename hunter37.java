package guvi;
import java.util.Scanner;
public class hunter37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1="Racercar";
		StringBuffer sb=new StringBuffer(s1);
		int n1=sb.indexOf("r");
		System.out.println(n1);
		sb.deleteCharAt(n1);
		String s2=" ";
		s2=s2+sb;
		System.out.println(s2);
		
		

	}

}
