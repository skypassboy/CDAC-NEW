// check prime no
#include<stdio.h>
#include<stdlib.h>
int main(void){

    int no;
    int count=0;
    int fact;


    printf("Enter no :");
    scanf("%d",&no);

    if(no<=1){
        printf("Not Prime");
    }
    else{
        for(int i =1;i<=no;i++){
            if(no%i==0){
                count++;
            }
        }

        if(count>2){
            printf("not prime");
        }
        else{
            printf("prime");
        }
    }
    
    return 0;
}
