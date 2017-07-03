package guvi;
import java.util.Scanner;
public class pro21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int sum=0,sum1=0,avg=0,avg1=0;
int a[]=new int[n];
int l=(n+1)/2;
int l1=n-l;
for(int i=0;i<n;i++)
{
	a[i]=s.nextInt();
}
if(n%2==1)
{
for(int i=0;i<l;i++)
{
  sum+=a[i];
  avg=sum/l;
}
}
else
{
	for(int i=0;i<l;i++)
	{
	  sum+=a[i];
	  avg=sum/l;
	}
}
if(l1%2==1)
{
for(int i=0;i<l1;i++)
{
	
  sum1+=a[i];
  avg1=sum1/l1;
}
}
else
{
	for(int i=0;i<l1;i++)
	{

	  sum1+=a[i];
	  avg1=sum1/l1;
	}
}
	
	if(avg==avg1)
	{
		System.out.println("it is possible");
	}
	else
	{
		System.out.println("it is not possible");
	}

  
}
}

