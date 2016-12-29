#include<stdio.h>
#include<conio.h>
int main(){
int n,sum=0,a[10],i;
printf("\n enter the size");
scanf("%d",&n);
printf("\n enter the elements:");
for(i=0;i<n;i++){
scanf("%d",&a[i]);}
for(i=0;i<n;i++){
sum=sum+a[i];
}
printf("%d",sum);
}
