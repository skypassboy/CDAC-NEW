#include<iostream>
using namespace std;
class Date
{
    int day,month,year;
    public:
    Date(); //no argument constructor
    Date(int,int,int);  //paramterised constructor
    void Display();
};
int main()
{
    Date d1;
    d1.Display();

    Date d2(1,2,2023);
    d2.Display();

    Date d3;
    d3.Display();
    
    Date d4(2,3,2012);
    d4.Display();

    cout<<endl<<endl<<endl;
    return 0;
}
void Date::Display()
{
    cout<<endl<<endl<<"Date : "<<day<<"/"<<month<<"/"<<year;
}
Date::Date()
{
    day=month=1;
    year=2023;
}
Date::Date(int d,int m,int y)
{
    day=d;
    month=m;
    year=y;
}
