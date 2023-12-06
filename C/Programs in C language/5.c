// accept number from user and calculate sum of all digits and count digits

#include<stdio.h>
#include<stdlib.h>
int main(void){
    int no;
    int count = 0;
    int sum = 0;
    int mod;

    printf("Enter no : ");
    scanf("%d",&no);

    while(no!=0){
        mod = no%10;
        count++;
        no=no/10;
        sum = sum + mod; 
    }

    printf("count = %d, Sum = %d",count,sum);

    return 0;
}