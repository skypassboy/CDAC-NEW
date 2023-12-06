#include<iostream>
#include<string.h>
using namespace std;


class Date
{
    int day, month, year;

public:
    Date(int, int, int);
    void display();
    Date();
};

Date ::Date()
{
    day = month = 1;
    year = 2023;
}
Date ::Date(int d, int m, int y)
{
    day = d;
    month = m;
    year = y;
}

void Date ::display()
{
    cout << endl<<"birth date : "<< day << "-" << month << "-" << year << endl;
}


class String
{

    int length;
    char *str;

public:
    String();
    String(const char *);
    ~String();
    void display();
    String(String &);
};

String ::String(String &r)
{
    this->length = r.length;
    this->str = new char[this->length + 1];
    strcpy(str, r.str);
}

String::String()
{

    length = 1;
    str = new char[length];
    str[0] = '\0';
}
void String ::display()
{
    cout << endl<<"Employee name : "<<str<<endl;
}

String ::String(const char *str)
{
    this->length = strlen(str);
    this->str = new char[this->length + 1];
    strcpy(this->str, str);
}

String::~String()
{
    cout << endl
         << "destructor called..." << endl;
    delete[] str;
}


class Person{

    String name;
    Date bdate;

    public:
        Person();
        Person(const char *, int ,int ,int);
        void display();

};

Person ::Person(){

}

Person ::Person(const char *nm,int a,int b,int c):name(nm),bdate(a,b,c){

}

void Person::display(){
    name.display();
    bdate.display();
}


// employee class
class Emp : public Person{
    int eid;
    double salary;
    public:
    Emp();
    Emp(int ,const char * , int , int , int , double );
    void display();
};

Emp :: Emp(){
    eid = 0;
}
Emp::Emp(int eid,const char * nm, int c, int d, int e, double salary):Person(nm,c,d,e){
        this->eid = eid;
        this->salary = salary;
    }



void Emp ::display(){
    cout<<"Employee ID : "<<eid<<endl;
    Person::display();
    cout<<endl<<"Employee salary : "<<salary<<endl;
}

int main(){
    Emp e1(1,"ritesh",12,2,1999,50000);
    e1.display();
}
