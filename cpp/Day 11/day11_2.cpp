// Use already created Date class And String class
// 1. Create Person class as follows name object of String class dateOfBirst object of Date class.
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
    void setdate(int, int, int);
};

void Date :: setdate(int d, int m, int y){
    day=d;
    month=m;
    year=y;
}

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

class Student{
    int rno;
    char name[30];
    Date bDate;
    Date adDate;
    public :
        Student();
        Student(int, char *,int,int ,int ,int,int,int);
        void display();
        void setrno(int);
        void setname(char *);
        void setdateofbirth(int,int,int);
        void setdateofadmission(int,int,int);

};

void Student :: setdateofbirth(int a, int b, int c){
    bDate.setdate(a,b,c);
}

void Student :: setdateofadmission(int a,int b,int c){
    adDate.setdate(a,b,c);
}

void Student :: setrno(int rn){
    rno = rn;
}

void Student :: setname(char * nm){
    strcpy(name,nm);
}

Student :: Student(){

}

Student :: Student(int a ,char *name,int b1,int c1,int d1,int b2, int c2,int d2 ):bDate(b1,c1,d1),adDate(b2,c2,d2){
    this->rno = a;
    strcpy(this->name,name);
}


void Student :: display(){
    cout<<endl<<"Student roll no : "<<rno<<endl;
    cout<<endl<<"Student name :"<<name<<endl;
    cout<<endl<<"student birthdate :"<<endl;
    bDate.display();
    
    cout<<endl<<"student Admission Date :"<<endl;
    adDate.display();
}
int main()
{
    // Person p("Ritesh", 25, 05, 1999);
    // p.display();

    Student *stud;
    stud = new Student[2];
    int rno,d,m,y,d1,m1,y1;

    char name[20];

    for(int i=0;i<2;i++){
        cout<<"Enter roll no :";
        cin>>rno;
        stud[i].setrno(rno);

        cout<<"Enter Name :";
        cin>>name;
        stud[i].setname(name);

        cout<<"Enter date of birth :";
        cin>>d;
        cin>>m;
        cin>>y;
        stud[i].setdateofbirth(d,m,y);

        cout<<"Enter date of admission :";
        cin>>d1;
        cin>>m1;
        cin>>y1;
        stud[i].setdateofadmission(d1,m1,y1);
    }

    for(int i=0;i<2;i++){
        stud[i].display();
    }

}


