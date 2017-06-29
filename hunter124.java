package guvi;
import java.util.Scanner;
public class hunter124 {
	public static void main(String[] args){
Scanner s=new Scanner(System.in);
String str=s.next();
String s1[]=str.split(" ");
int temp=0;
char ch;
for(int i=0;i<s1.length;i++)
{
	ch=s1[i].charAt(i);
	if(Character.isUpperCase(ch))
	{
		temp++;
	
	}
	if(temp==1)
	{
		System.out.println("true");
	}
	else
	{
		System.out.println("false");
	}
	
}
}
}
