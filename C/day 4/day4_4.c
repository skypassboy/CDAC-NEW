// 4. find out average of all elements of array using function.

#include<stdio.h>
#include<stdlib.h>

float avg(float[],float);

int main(void){

    float average;

    float arr[5] = {12,34,23,45,34};

    average = avg(arr,5);

    printf("Average is %f ",average);

}

float avg(float arr[],float size){

        float sum = 0;
        float avg;
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
        }
        avg = sum/ 5;

        return avg;
}