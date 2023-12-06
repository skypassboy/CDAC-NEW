#include<iostream>
using namespace std;
class Test1
{
    int no1,no2;
    public:
    virtual void Display()
    {
        cout<<"\n\n\t In Test1 Class ";
    }
};
class Test2
{
    int no1,no2;
    public:
    void Display()
    {
        cout<<"\n\n\t In Test2 Class ";
    }
};

int main()
{
    cout<<"\n\n\t Test1 "<<sizeof(Test1);
    cout<<"\n\n\t Test2 "<<sizeof(Test2);
    cout<<"\n\n\t ";
     
}