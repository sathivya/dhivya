package guvi;
import java.util.Arrays;
import java.util.Scanner;
public class pro2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int b[]=new int[n];
		int temp=0;
		
		
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
	    Arrays.sort(a);
	    for(int i=0;i<n;i++)
	    {
	    	b[i]=a[i];
	    	System.out.println(b[i]);
	    }
	   String str=Arrays.toString(b);
	   String sep=" ";
	   str=str.replaceAll(",", sep).replace("[","" ).replace("]","");
	   String s5=str.replaceAll("\\s","");
	   System.out.println("enter the digit");
	   int k=s.nextInt();
	   String s3=s5.substring(0,k);
	   String s6=s5.replaceAll(s3,"");
	   int n1=Integer.parseInt(s6);
	   System.out.println(s6);
	 
	  
	}
	    
	}
	

	

