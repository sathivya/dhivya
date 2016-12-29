#include<stdio.h>
#include<conio.h>
int main()
{
int a;
printf("\n enter the year:");
scanf("%d",&a);
if((a%4==0)||(a%100!=0&&a%400==0))
printf("\n it is a leap year");
else
printf("\n it is not a leap year");
}
