package guvi;
import java.util.Scanner;
public class hunter72 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String s3="";
		String s5=" ";
		char ch; 
		String []s2=s1.split(" ");
		//String []odd=new String[s2.length];
		for(int i=1;i<s2.length;i++)
		{
			System.out.println(s2[i]);
		}
		  for(int i=0;i<s2.length;i++)
		  {
			if(i%2==0)
			{
				StringBuffer odd=new StringBuffer(s2[i]);
				s5=odd.reverse()+" ";
				
			}
			else
			{
			  s5=s2[i];
			}
			s3=s3+s5+" ";
			System.out.println(s3);
		}
		

		
		
		
		
		/*for(int i=1;i<s2.length;i++)
		{  
			for(int j=1;j<s2.length;j++)
			{
			ch=s2[i].charAt(j);
			//System.out.println(ch);
			s3=s3+ch;
			   if(s2[i].length()%2==1)
			   {
				StringBuffer s4=new StringBuffer(s3);
				s4.reverse().toString();
				 s5=s5+s4;
			}
			   else
			   {
				   s5=s5+s3;
			   }
			}
			
			System.out.print(s5);
		}*/
		
		
		
    }
    }
