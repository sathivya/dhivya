#include<stdio.h>
#include<conio.h>
int main()
{
int a,n,i,factorial=1;
printf("\n enter the number:");
scanf("%d",&n);
for(i=1;i<=n;++i){
        factorial *=i;
}
printf("\n the factorial of a is%d",factorial);
return 0;
}
