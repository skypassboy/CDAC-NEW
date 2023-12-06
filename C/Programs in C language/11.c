// 1
// 22
// 333
// 4444
// 55555

#include<stdio.h>
#include<stdlib.h>
int main(void){
    
    for(int i=1;i<=5;i++){
        for(int j=1;j<=i;j++){
            printf("%d",i);
        }
        printf("\n");
    }


}