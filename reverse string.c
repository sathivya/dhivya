#include<stdio.h>
#include<conio.h>
#include<string.h>
char str[10],str1[10];
int main(){
int i;
printf("\n enter the string:");
scanf("%s",str);
for(i=0;i<strlen(str);i++){
str1[strlen(str)-i-1]=str[i];
printf("\n%s",str1);
}
return 0;
}
