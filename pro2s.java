package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class pro2s {
	public static void main(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int n1=s.nextInt();
	int c[]=new int[n1];
	int temp=0;
	
	
	int d[]=new int[n1];
	for(int i=0;i<n1;i++)
	{
		d[i]=s.nextInt();
	}
    Arrays.sort(d);
    for(int i=0;i<n1;i++)
    {
    	c[i]=d[i];
    	System.out.println(c[i]);
    }
   String str=Arrays.toString(c);
   String sep=" ";
   str=str.replaceAll(",", sep).replace("[","" ).replace("]","");
   String s5=str.replaceAll("\\s","");
   System.out.println("enter the digit");
   int k=s.nextInt();
   String s3=s5.substring(0,k);
   String s6=s5.replaceAll(s3,"");
   int n2=Integer.parseInt(s6);
   System.out.println(s6);
 
  
}
    
}





