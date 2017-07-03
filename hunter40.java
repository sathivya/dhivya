package guvi;
import java.util.Scanner;
public class hunter40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 int n=s.nextInt();
 int r,r1;
 int sum=0;
 int rev=0;
 int temp=0;
 int temp1=0;
 while(n!=0)
 {
	 r=n%10;
	 sum=sum+r;
	 n=n/10;
 }
 temp=sum;
 System.out.println(sum);
 while(sum!=0)
 {
	 r1=sum%10;
	 rev=rev*10+r1;
	 sum=sum/10;
	 
 }
 temp1=rev;
 System.out.println(rev);
 if(temp==temp1)
 {
	 System.out.println("it is palindrome");
 }
 else
 {
	 System.out.println("it is not palindromne");
 }
 
	}

}
