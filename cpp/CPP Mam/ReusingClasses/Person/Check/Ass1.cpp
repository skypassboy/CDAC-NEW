#include<iostream>
#include<string.h>
using namespace std;
class Date
{
    int day,month,year;
    public:
    Date();
    Date(int,int,int);
    void Display()const;
};
class cString
{
    int len;
    char *str;
    public:
    cString();
    cString(const char*);
    cString(cString&);
    cString operator=(cString&);
    ~cString();
    void Display();
};
class Person
{
    cString name;
    Date bdate;
    public:
    Person();
    Person(const char*,int,int,int);
    void Display();
};
int main()
{
    Person p1;
    p1.Display();

    Person p2("Seeta",2,3,2000);
    p2.Display();
    cout<<"\n\n\n";
    return 0;
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
void Date::Display()const
{
    cout<<"\n\t Date    : "<<day<<"/"<<month<<"/"<<year;
}
cString::cString()
{
    len=1;
    str=new char[1];
    str[0]='\0';
}
cString::cString(const char *str)
{
    this->len=strlen(str);
    this->str=new char[this->len+1];
    strcpy(this->str,str);
}
cString::cString(cString &obj)
{
    this->len=obj.len;
    this->str=new char[this->len+1];
    strcpy(this->str,obj.str);
}
cString cString::operator=(cString &obj)
{
    this->len=obj.len;
    this->str=new char[this->len+1];
    strcpy(this->str,obj.str);
    return *this;
}
cString::~cString()
{
    delete[]str;
}
void cString::Display()
{
    cout<<"\n\t Name    : "<<str;
}
Person::Person()
{

}
Person::Person(const char *str,int d,int m,int y):name(str),bdate(d,m,y)
{
   // this->name=cString(str);
    //bdate=Date(d,m,y);
}
void Person::Display()
{
    name.Display();
    bdate.Display();
}