#include<iostream>
#include<string.h>
using namespace std;
class Employee
{
    static int cnt;
    int eid;
    char name[20];
    double salary;
    public:
    Employee();
    Employee(const char*,double);
    void Display()const;
};
int Employee::cnt=100;
int main()
{
    Employee e1;
    e1.Display();
    Employee e2("Seeta",4000);
    e2.Display();
    Employee e3("Geeta",7000);
    e3.Display();

    cout<<endl<<endl<<endl;
    return 0;
}
Employee::Employee()
{
    cnt++;
    eid=cnt;
    strcpy(name,"NA");
    salary=1000;
}
Employee::Employee(const char *str,double sal)
{
    cnt++;
    eid=cnt;
    strcpy(name,str);
    salary=sal;
}
void Employee::Display()const
{
    cout<<endl<<endl<<" ********* EID : "<<eid<<" ************";
    cout<<endl<<endl<<" Name    : "<<name;
    cout<<endl<<endl<<" Salary  : "<<salary;
}
