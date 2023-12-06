#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    int index;
    char ch;
    char str[20]="Know It";
    cout<<"\n\n\t Enter Index ";
    cin>>index;
    try
    {
        if(index<0)
           throw "Not Allowd";
        if(index>=strlen(str))
           throw 100;
        ch=str[index];
        cout<<"\n\n\t Character At "<<index <<" Is "<<ch;
    }
    catch(const char *s)
    {
        cout<<"\n\n\t In char array Catch Block";
        
    }
    catch(int n)
    {
        cout<<"\n\t Int Catch Block";
    }
   

    cout<<"\n\n\t String Is : "<<str;

 cout<<"\n\n\n";
}