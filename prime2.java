package Array;
import java.util.Scanner;
public class prime2 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int flag=0;
		System.out.println("Enter the range1");
		int d=s.nextInt();
		System.out.println("enter the range2");
		int h=s.nextInt();
		
	       
       for(int i=d;i<=h;i++)
       {
    	  for(int j=2;j<i;j++)
    	  {
    		  if(i%j==0)
    		  {
    			  flag=1;
    			  break;
    		  }
    		  else
    		  {
    			  flag=0;
    		  }
    	  }
       if(flag==0)
       {
        System.out.println(i);
       }
       }
	}
}
