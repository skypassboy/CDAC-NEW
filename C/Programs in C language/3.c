// accept base and index from user and calculate power
#include<stdio.h>
#include<stdlib.h>
int main(void){

    int base, index;
    int ans=1;

    printf("Enter base : ");
    scanf("%d",&base);

    printf("Enter index : ");
    scanf("%d",&index);

    for(int i=1;i<=index;i++){
        ans = ans*base;
    }

    printf("ans = %d ",ans);

    return 0;
}