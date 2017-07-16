package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class hunter62 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=10;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int max=-999;
		int min=-888;
		int maxprofit=0;
		Arrays.sort(a);
		for(int i=0;i<n;i++)
		{
			min=a[0];
			max=a[a.length-1];
			maxprofit=max-min;
		}
		System.out.println(max+" "+min+" "+maxprofit+"thounsand");

	}

}
