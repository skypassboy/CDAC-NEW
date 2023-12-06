// 3. Find out max element from array using function.

#include<stdio.h>
#include<stdlib.h>

int findMax(int[] ,int );

int main(void){
    

    int max;

    int arr[5] = {12,15,36,96,83};

    max=findMax(arr,5);

    printf("Max in arr is %d",max);

}

int findMax(int arr[],int size){

    int max=arr[0];

    for( int i=0;i<size;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;

}