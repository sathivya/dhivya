package guvi;
import java.util.Scanner;
public class hunter75 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     {
    	 a[i]=s.nextInt();
     }
     for(int i=0;i<n-1;i++)
     {
    	 if(a[i]>a[i+1])
    	 {
    		 a[i]=a[i+1];
    	 }
    	 else
    	 {
    		 a[i]=-1;
    	 }
     }
     a[n-1]=-1;
     for(int i=0;i<n;i++)
     {
    	 System.out.println(a[i]);
     }
	}

}
