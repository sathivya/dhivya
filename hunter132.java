package guvi;
import java.util.Scanner;
public class hunter132 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n-i;j++)
			{
				System.out.print("*");
			}
			for(int k=0;k<=0;k++)
			{
				System.out.print(" ");
			}
			for(int m=0;m<n-i;m++)
			{
				System.out.print("*");
			}
			System.out.println("\n");
		}

	}

}
