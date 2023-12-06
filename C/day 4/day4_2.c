// 2. Accept number from user and print it's multiplication table using function.

#include<stdio.h>
#include<stdlib.h>

void table(int);

int main(void){

    int num;

    printf("Enter no. : ");
    scanf("%d",&num);

    table(num);


}

void table(int num){

    for(int i=1;i<=10;i++){
        printf("\n %d ",num*i);
    }
}