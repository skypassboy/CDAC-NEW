//     *
//    * *
//   * * *
//  * * * *
// * * * * *

#include<stdio.h>
#include<stdlib.h>
int main(void){
    int rows;
    printf("Enter no of Rows : ");
    scanf("%d",&rows);

    for(int i=1;i<=rows;i++){

        for(int space=1;space<=rows-i;space++){
            printf(" ");
        }
        for(int j=1;j<=i;j++){
            printf("* ");
        }
        printf("\n");
    }

    return 0;
}