/*
conditional operator  ( ternary operator)

condition ? true part : false part;

no%2==0 ? printf("%d is even", no) :  printf("%d is odd", no);

*/
#include<stdio.h>
int main(void)
{
    int no;
    printf("\n Enter no=");
    scanf("%d", &no);

    no%2==0 ? printf("%d is even", no) :  printf("%d is odd", no);
    printf("\n");
    no%2 ? printf("%d is odd", no) :  printf("%d is even", no);

    {  // if else if
        //condition ? true part :   condition ? true part : false part;
        no>0 ?  printf("\n %d is +ve", no) : no==0 ? printf("\n %d is zero", no) : printf("\n %d is -ve", no);
    }

    return 0;

}