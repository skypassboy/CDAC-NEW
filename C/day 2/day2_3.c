#include<stdio.h>
#include<stdlib.h>
int main(void){

    int base,index,temp;
    int power=1;

    printf("Enter base :");
    scanf("%d",&base);

    printf("Enter index :");
    scanf("%d",&index);

    temp= base;
    for(int i=1;i<=index;i++){
        
        power = power* temp;

    }

    printf("Power is %d", power);

    return 0;




}