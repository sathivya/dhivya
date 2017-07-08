package dhivyaguvi;
import java.util.Scanner;
public class hunter55 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter the array size");
		int n=s.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
        System.out.println("enter the size to rotate the array");
        int d=s.nextInt();
        for(int i=d;i<n;i++)
        {
        	System.out.println(a[i]);
        }
for(int i=0;i<d;i++)
{
	System.out.println(a[i]);
}
	}

}
