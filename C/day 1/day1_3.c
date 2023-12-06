// how to use scanf for character
// for scaning charecter use getchar() before scanf statement of character

#include<stdio.h>
int main(void)
{
    int no1;
    char ch;
    float no2;

    printf("\n Enter no1=");
    scanf("%d",&no1);

    printf("\n Enter ch=");
    // scanf("%*c%c",&ch);  //  %*c ignores one char
    //or
    getchar();  //scan one char \n
    scanf("%c", &ch);

    printf("\n Enter no2=");
    scanf("%f",&no2);

    printf(" no1=%d  ch=%c ch=%d  no2=%f", no1, ch, ch, no2);
    return 0;
}