package guvi;
import java.util.Scanner;
public class pro52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=2;
		int a[]=new int[n];
		int b[]=new int[n];
		int c[]=new int[n];
		int d[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
			b[i]=s.nextInt();
			c[i]=s.nextInt();
			d[i]=s.nextInt();
		}
		int x=0,y=0,w=0,z=0;
		for(int i=0;i<n;i++)
		{
			w=w+a[i];
			x=x+b[i];
			y=y+c[i];
			z=z+d[i];
		}
		int h,k;
		h=x-w;
		k=y-z;
			if(h==k)
			{
				System.out.println("it forms square");
			}
			else
			{
				System.out.println("it dosen't form a square");
		}
		

	}

}
