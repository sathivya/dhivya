package guvi;
import java.util.Scanner;
public class pro17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
	int sum=1;
	int sum1=n;
	int r;
	while(n!=0)
	{
		r=n%10;
		sum=sum*r;
		n=n/10;

	}
	System.out.println(sum*sum1+ "the given number find all its seeds");

	}

}
