#include<iostream>
using namespace std;
int Add(int a,int b)
{
   return a+b;
}
int main(int a,char *b[])
{
    int no1,no2;
    no1=atoi(b[1]);
    no2=atoi(b[2]);
    int res=Add(atoi(b[1]),atoi(b[2]));
    cout<<endl<<endl<<"Adition : "<<Add(no1,no2);
    cout<<endl<<endl;
}