#include<iostream>
using namespace std;
class A
{
    char name[60];
};
class B:virtual public A
{
    char str[20];
};

class C:virtual public A{
 double no1,no2,no3;
};
class D:public B,public C
{

};

int main()
{
    cout<<"\n\n\t Class A   "<<sizeof(A);
    cout<<"\n\n\tClass B   "<<sizeof(B);
    cout<<"\n\n\tClass C   "<<sizeof(C);
    cout<<"\n\n\tClass D   "<<sizeof(D);
 
    cout<<"\n\n\t";
    
    return 0;
}