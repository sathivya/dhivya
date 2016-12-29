#include<stdio.h>
#include<conio.h>
int main(){
int n,intger,i,rev=0,rem;
printf("\n enter the intger:");
scanf("%d",&intger);
while(intger!=0){
    rem=intger%10;
    intger=intger/10;
    rev=rev*10+rem;


}
printf("\n the reversed number is %d",rev);





}







