#include<stdio.h>
#include<conio.h>
int main(){
int n,i,a[10],sum=0;
printf("\n enter the size");
scanf("%d",&n);
printf("\n enter the elments");
for(i=0;i<n;i++){
    scanf("%d",&a[i]);
}
for(i=1;i<n;i++){
    sum=sum+a[i];
    printf("%d",sum);

}
getch();
}
