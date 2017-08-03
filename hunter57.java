package guvi;
import java.util.Scanner;
public class hunter57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=0;
		int count=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]!=a[j]){
					count=1;
					a[i]=a[j];
					temp=a[i];
					
				}
			}
		}
		System.out.println(temp);
	}

}
