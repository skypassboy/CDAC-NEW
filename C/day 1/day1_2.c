// Use of scanf

#include<stdio.h>
#include<stdlib.h>
int main(void){
    int no1, no2, ans;
    printf("Enter no 1 :");
    scanf("%d",&no1);
    printf("Enter no 2 :");
    scanf("%d",&no2);

    ans = no1+no2;

    printf("\n %d+ %d = %d",no1,no2,ans);
    return 0;
}