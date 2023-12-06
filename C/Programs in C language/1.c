// accept character from user and print its opposite case

#include<stdio.h>
#include<stdlib.h>
int main(void){

    char ch;

    printf("Enter character : ");
    scanf("%c",&ch);

    if(ch>=65 && ch<=90){
        printf(" Given character is in uppercase < %c > Converted to lowercase < %c > ",ch,ch+32);
    }
    else if(ch>=97 && ch<=122){
        printf(" Given character is in lowercase < %c > Converted to uppercase < %c > ",ch,ch-32);
    }

    return 0;

}