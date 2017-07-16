package guvi;
import java.util.Scanner;
public class hunter63 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		int max=-777;
		for(int i=0;i<n;i++)
		{
			max=0;
			for(int j=i+1;j<n;j++)
			{
				if(a[j]>max)
				{
					max=a[j];
				}
				
			}
			a[i]=max;
			System.out.println(a[i]);
		}

	}

}
