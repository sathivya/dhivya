package guvi;
import java.util.Scanner;
public class hunter129 {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("enter the string");
		String str=s.next();
		int sum=0;
		int sum1=0;
		byte[]b=str.getBytes();
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
		for(int i=0;i<b.length;i++)
		{
			sum=sum+(b[i+1]-b[i]);
		}
		sum1=sum-b[0];
		int sum2=Math.abs(sum1);
		System.out.println((char)sum2);
	}
}