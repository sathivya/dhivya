package guvi;
import java.util.Scanner;
public class hunter64 {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int r1=0;
	int count=0,count1=0,count2=0,count3=0,count4=0;
	int currency=0;
	int a500=0,a100=0,a50=0,a10=0,a9=0;
	int b=0,b1=0,b2=0,b3=0,b4=0;
	
		 a500=n%500;
		 b=a500/100;
		 count=b;
		 a100=a500%100;
		 b1=a100/10;
		  count1=b1;
		  a50=a100%50;
		  b2=a50/10;
		  count2=b2;
		  a10=a50%10;
		  b3=a10/10;
		  count3=b3;
		  a9=a10%10;
		  b4=a9/10;
		  count4=b4;
		 
	    currency=count+count1+count2+count3+count4;
	    System.out.println(count+" "+count1+" "+count2+" "+count3+" "+count4);
    System.out.println(currency);
}
}

