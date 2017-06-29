package guvi;
import java.util.Scanner;
public class hunter111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.next();
		char ch[];
		char ch1;
		int temp=0;
		int temp1=0;
		ch=s1.toCharArray();
		for(int i=0;i<s1.length();i++)
		{
		
				 if(ch[i]>='A'&&ch[i]<='M'||ch[i]>='a'&&ch[i]<='m')
		         {
			   temp++;
		         }
			   
				 else if  (ch[i]>='N'&&ch[i]<='Z'||ch[i]>='n'&&ch[i]<='z')
		       {
				 temp1++;
		       }
		}
				 if(temp==temp1)
				 {
					   System.out.println("balanced");
				  
				   
		   }
		   else
		{
			System.out.println("not balanced");
		}
	
		
		}
	}


