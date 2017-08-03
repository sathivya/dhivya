package guvi;
import java.util.Scanner;
public class hunter52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int count1=0;
		int count2=0;
		for(int i=0;i<n;i++)
		{
			count1++;
		}
			System.out.println("one stair count is"+count1);
	
		for(int i=1;i<n;i=i+2)
		{
			count2++;
		}
			System.out.println("second stair count is"+count2);
		

	}

}
