#include<iostream>
using namespace std;

class Math
{
    int no1,no2;
    public:
    void setData(int,int);
    void Addition();
    void Subtraction();
    void Multiplication();
    void Division();
};
int main()
{
    Math m1;
    m1.setData(10,2);
    int ch;
    do
    {
        cout<<endl<<endl<<"\t1. Addition\
                         \n\t2. Subtraction\
                          \n\3. Multiplication\
                          \n\t4. Division\
                          \n\t0. Exit\
                          \n\t Enter Your Choice ";
        cin>>ch;
        switch(ch)
        {
            case 1:
            m1.Addition();
            break;
        case 2:
        m1.Subtraction();
        break;
        case 3:
        m1.Multiplication();
        break;
    case 4:
    m1.Division();
    break;
        }
    } while (ch!=0);
    





}
void Math::setData(int a,int b)
{
    no1=a;
    no2=b;
}
void Math::Addition()
{
    cout<<endl<<endl<<"["+no1<<"+"<<no2<<"="<<no1+no2+"]";
}
void Math::Subtraction()
{
    cout<<endl<<endl<<"["+no1<<"-"<<no2<<"="<<no1-no2+"]";
}
void Math::Multiplication()
{
    cout<<endl<<endl<<"["+no1<<"*"<<no2<<"="<<no1*no2+"]";
}
void Math::Division()
{
    cout<<endl<<endl<<"["+no1<<"/"<<no2<<"="<<no1/no2+"]";
}
