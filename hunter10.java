package guvi;
import java.util.Scanner;
public class hunter10 {
	public static void main(String[]args){
		Scanner s=new Scanner(System.in);
		int count=0;
		int a[]=new int[5];
		int b[]=new int[5];
		int len=b.length;
		int flag=0;
		System.out.println("enter the array1");
		for(int i=0;i<a.length;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("enter the array2");
		for(int i=0;i<b.length;i++)
		{
			b[i]=s.nextInt();
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]== b[j])
				flag=1;
				count++;
					break;
			}
		}
if(count ==len )
{
	System.out.println("the array1 is not a subset of array2");
}
else
{
	System.out.println("the array1 is a subset of array2");
}
				
			
		
	}

}
