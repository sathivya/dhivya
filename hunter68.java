package guvi;
import java.util.Scanner;
public class hunter68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int max=-111;
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
int index=0;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
			if(a[i]-a[j]>max)
			{
			max=a[i]-a[j];
			  index=i;
			}
			}
		}
System.out.println("the maximum elements is "+max+" "+index);
	}

}
