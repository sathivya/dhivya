#include<stdio.h>
#include<conio.h>
void main(){
char str;
printf("\n enter the character:");
scanf("%c",&str);
if((str >='a'&&str<='z')||(str >='A'&&str<='Z'))
printf("\n it is alphabet");

else
printf("\n it is not alphabet");
}
