// find factorial of given no;

#include<stdio.h>
#include<stdlib.h>
int main(void){

    int fact=1;
    int no;
    printf("Enter no :");
    scanf("%d",&no);

    for(int i=1; i<=no;i++){
        fact=fact*i;
    }

    printf("%d",fact);

    return 0;

}