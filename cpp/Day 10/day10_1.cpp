// Use already created Date class And String class
// 1. Create Person class as follows name object of String class dateOfBirst object of Date class.
// 


// containment

#include <iostream>
#include <string.h>

using namespace std;

// Date class;
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
    cout << endl
         << day << "-" << month << "-" << year << endl;
}

// sting class

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
    cout << endl
         << str << " " << length;
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

// Person class

class Person
{
    String name;
    Date dateOfBirth;

public:
    Person();
    Person(String, Date);
    Person(const char *, int, int, int);
    void display();
};

Person ::Person()
{
}

// convential method

// Person :: Person(const char *str,int d,int m,int y)
// {
//     String temp(str);
//     name= temp;
//     dateOfBirth= Date(d,m,y);

// }

Person::Person(const char *str, int d, int m, int y) : dateOfBirth( d, m, y),name(str){
    
};

void Person ::display()
{
    cout << endl
         << "Name is :" << endl;
    name.display();
    cout << endl
         << "Bdate is : " << endl;
    dateOfBirth.display();  
}




int main()
{
    Person p("Ritesh", 25, 05, 1999);
    p.display();
}