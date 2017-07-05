package guvi;
import java.util.Scanner;
public class hunter70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int a[]=new int[n];
	 for(int i=0;i<n;i++)
	 {
		 a[i]=s.nextInt();
	 }
	 System.out.println("enter the target value");
	 int t=s.nextInt();
	 int m=0;
	 for(int i=0;i<n;i++)
	 {
		 m=m+a[i];
	 }
	 if(m==t)
	 {
		 System.out.println("TRUE");
	 }
	 else
	 {
		 System.out.println("FALSE");
	 }

	}

}
