#include<iostream>
using namespace std;

class Math1{
    public:
    void Addition(int a,int b)
    {
        cout<<"\n\n\t"<<a<<"+"<<b<<"="<<a+b;

    }
     void Subtrcation(int a,int b)
    {
        cout<<"\n\n\t"<<a<<"-"<<b<<"="<<a-b;

    }
    void calculateArea(int r)
    {
        cout<<"\n\n\t ARea " <<3.14f*r*r;

    }
};
class Math2{
    public:
    void Multiplication(int a,int b)
    {
        cout<<"\n\n\t"<<a<<"*"<<b<<"="<<a*b;

    }
     void Division(int a,int b)
    {
        cout<<"\n\n\t"<<a<<"/"<<b<<"="<<a/b;

    }
    void calculateArea(int s)
    {
        cout<<"\n\n\t ARea " <<s*s;

    }
};
class Calculator:public Math1,public Math2
{

};

int main()
{
    Calculator c1;
    c1.Addition(10,2);
    c1.Multiplication(10,2);
    c1.Subtrcation(10,2);
    c1.Division(10,2);
    //c1.calculateArea(5);
    // Both Math1 and Math2 has same copy of Function 
    c1.Math2::calculateArea(5);
    


    cout<<"\n\n\n";
    return 0;
}


