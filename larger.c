#include<stdio.h>
#include<conio.h>
int main(){
int a,b,c;
printf("\n enter the values:");
scanf("%d %d %d",&a,&b,&c);
if(a>b)
    printf("\n a is greater");
    else if(b>c)
     printf("\n b is greater");
     else if(c>a)
     printf("\n c is greater");
     else
       return 0;
       }
