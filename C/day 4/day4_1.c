// 1. Accpet number from user and Count number of digits using function.


#include<stdio.h>
#include<stdlib.h>

int countDigits(int);

int main(void){


    int num,count;
    printf("Enter no. : ");
    scanf("%d",&num);

    count = countDigits(num);
    printf("count is %d",count);

}
int countDigits(int num){

    int mod;
    int count=0;
    while(num!=0){

        mod=num%10;
        count++;
        num = num/10;
    }
    return count;
}