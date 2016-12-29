#include<stdio.h>
#include<conio.h>
void main(){
char ch[5];int i;
printf("\n enter the string:");
scanf("%s",ch);
for(i=0;i<strlen(ch);i++){
printf("%d",ch[i]);
}
}
