//Create date class with day ,month and year data member
// create 4 objects and 
// check whether date is valid or not
#include<iostream>
using namespace std;

class Date
{
    private:
    int day,month,year;
    public:
    void setDate(int,int,int);
    void display();
    int getDay();
    int getMonth();
    int getYear();
};
int main()
{
    Date d1;
    int i;
    int dd,mm,yy;
    d1.setDate(33,2,2023);
    d1.display();
    dd=d1.getDay();
    mm=d1.getMonth();
    yy=d1.getYear();
    if((dd>=1 && dd<=31) && (mm>=1 && mm<=12))
    {
        cout<<endl<<"\t Valid Date ";
    }
    else 
        cout<<endl<<"\t Not Valid Date ";
    /*
      month=1,3,5,7,8,10,12
    day =1--- 31
    year=
    */
      
    Date d[5];
    for(i=0;i<5;i++)
    {
        cout<<endl<<endl<<"\t Enter Day Month And Year ";
        cin>>dd>>mm>>yy;
        d[i].setDate(dd,mm,yy);
    }
    for(i=0;i<5;i++)
    d[i].display();



    cout<<endl<<endl<<endl;
    return 0;

}

void Date::setDate(int d,int m,int y)
{
    day=d;
    month=m;
    year=y;
}
void Date::display()
{
    cout<<endl<<"\tDate : "<<day<<"/"<<month<<"/"<<year;
}
int Date::getDay()
{
    return day;
}
int Date::getMonth()
{
    return month;
}
int Date::getYear()
{
    return year;
}
