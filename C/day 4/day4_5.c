// 5. Write a function which will return diffrence between max and min element of array.


#include<stdio.h>
#include<stdlib.h>

int difference(int [],int);

int main(void){


    int diff;
    int arr[5] = {11,23,34,10,9};

    diff = difference(arr,5);
    printf(" difference between max and min is %d ",diff);

}

int difference(int arr[],int size){

    int max = arr[0];
    int min = arr[0];
    int diff;

    for(int i=0;i<size;i++){
        if(arr[i]>max){
            max = arr[i]; 
            };

        if(arr[i]<min){
            min=arr[i];
        }
    }

    diff = max-min;

    return diff;

}