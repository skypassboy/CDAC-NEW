//     *
//    **
//   ***
//  ****
// *****

#include<stdio.h>
#include<stdlib.h>
int main(void){

    int rows;
    printf("Enter no of rows : ");
    scanf("%d",&rows);
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=rows;j++){
           
            if(i+j<=rows){
                printf(" ");
            }
            else{
                printf("*");
            }

        }
            printf("\n");
    };

    return 0;

}