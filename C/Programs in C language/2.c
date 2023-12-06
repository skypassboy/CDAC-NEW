// factorial

#include<stdio.h>
#include<stdlib.h>
int main(void){

    int no;
    int fact=1;

    printf("Enter no : ");
    scanf("%d",&no);

    for(int i=1;i<=no;i++){
        fact = fact*i;
    }

    printf("factorial of no %d is = %d ",no,fact);
    return 0;
}