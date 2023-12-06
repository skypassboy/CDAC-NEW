// check whether no is present in arr, if present print index if that no else print not found

#include<stdio.h>
#include<stdlib.h>


int main(void){

    int key;

    printf("Enter no. :");
    scanf("%d",&key);



}

int check(int arr[], int size,int key){



    for(int i=0;i<size;i++){
        if(arr[i]==key){
            return i;
        }
        else{
            return 0;
        }
    }


}