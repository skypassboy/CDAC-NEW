// Accept charecter from user and print the opposite case

#include<stdio.h>
#include<stdlib.h>
int main(void){

    char ch,lower,upper;

    printf("Enter character :");
    scanf("%c",&ch);

    if(ch>=65 && ch<=90){
        lower = ch+32;
        printf("Given character < %c > is in uppercase, converted to lowercase < %c >",ch,lower);
    }
    else if(ch>=97 && ch<=122){
        upper = ch-32;
        printf("Given character < %c > is in lowercase, converted to uppercase < %c >",ch,upper);
    }

    return 0;
}