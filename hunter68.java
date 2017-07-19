package guvi;
import java.util.Scanner;
public class hunter68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int temp=0;
		int max=-999;
		int index=0;
		int temp1=0;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n-1;i++)
		{ 
			temp=a[i]-a[i+1];
			 temp1=Math.abs(temp);
			max=0;
			
		    if(max<temp1){
				max=temp1;
			   index=i;
			   
		    }
			}
		
   System.out.println(index);
	
	}
}
