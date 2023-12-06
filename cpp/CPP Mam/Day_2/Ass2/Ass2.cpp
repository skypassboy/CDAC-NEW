#include<iostream>
using namespace std;
int main()
{
    int no1,no2,ch;
    cout<<"\n\t Enter Two Numbers ";
    cin>>no1>>no2;
    cout<<"\n\t1. Addition\
           \n\t2. Subtraction\
           \n\t3. Multiplication\
           \n\t4. Division\
           \n Enter Yourc choice ";
    cin>>ch;
    switch(ch)
    {
         case 1:
         cout<<"\n\t"<<no1<<"+"<<no2<<"="<<no1+no2;
         //break;
         case 2:
         cout<<"\n\t"<<no1<<"-"<<no2<<"="<<no1-no2;
         break;
         case 3:
         cout<<"\n\t"<<no1<<"*"<<no2<<"="<<no1*no2;
         break;
         case 4:
         cout<<"\n\t"<<no1<<"/"<<no2<<"="<<no1/no2;
         break;
    }

    cout<<"\n\n\n";
    return 0;
}