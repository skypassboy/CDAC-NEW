// take three number input and find average

#include<stdio.h>
#include<stdlib.h>
int main(void){
int no1,no2,no3;
float average;

printf("Enter no1 :");
scanf("%d",&no1);

printf("Enter no2 :");
scanf("%d",&no2);

printf("Enter no3 :");
scanf("%d",&no3);

average = (no1+no2+no3)/3;

printf("Average is = %f",average);

}