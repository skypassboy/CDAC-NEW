#include<stdio.h>
#include<conio.h>
#include<string.h>
int length(char*);
int main()
{
    char str[20];
    printf("\n\t Enter String ");
    scanf("%s",str);
    //gets(str);
    printf("\n\t String Is : %s",str);
    printf("\n\t Length Of %s Is %d",str,length(str));
    printf("\n\n\n");
    return 0;
}
int isVowel(char ch)
{
    int flag=0;
    switch(ch)
    {
        case 'A':
        case 'a':
        case 'E':
        case 'e':
        case 'O':
        case 'o':
        case 'I':
        case 'i':
        case 'u':
        case 'U':
           flag=1;

    }
    return flag;

}
int length(char *p)
{
    int cnt=0;
    while(*p!='\0')
    {
        if(isVowel(*p)==1)
             cnt++;
        p++;
    }
    return cnt;




}