#include<iostream>
#include<string.h>
using namespace std;
class Emp
{
    int eid;
    char name[20];
    double salary;
    public:
    Emp();
    Emp(int,const char *,double);
    void setValues(int,const char*,double);
    void Display();
};
Emp::Emp()
{
    eid=0;
    strcpy(name,"NA");
    salary=0;
}
Emp::Emp(int eid,const char *nm,double sal)
{
    this->eid=eid;
    strcpy(this->name,nm);
    this->salary=sal;
}
void Emp::setValues(int eid,const char *nm,double sal)
{ 
    this->eid=eid;
    strcpy(this->name,nm);
    this->salary=sal;
}
void Emp::Display()
{
    cout<<endl<<endl<<" Eid "<<eid<<"\tName : "<<name<<"\tSalary "<<salary;
}
class Department
{
    int did;
    char dname[20];
    Emp emps[3];
    public:
    Department();
    Department(int,const char *,Emp[],int);
    void Display();
};
Department::Department()
{

}
Department::Department(int id,const char *nm,Emp e[],int size)
{
    did=id;
    strcpy(dname,nm);
    for(int i=0;i<size;i++)
    emps[i]=e[i];
 }
 void Department::Display()
 {
    cout<<"\n\n\t Department Id: "<<did;
    cout<<"\n\n\t Department Name : "<<dname;
    for(int i=0;i<3;i++)
      emps[i].Display();
 }
int main()
{
    Emp e[3];
    e[0].setValues(101,"Seeta",10000);
    e[1].setValues(102,"Geeta",14000);
    e[2].setValues(103,"Neeta",12000);
    Department d(10,"Admin",e,3);
    d.Display();
}


    

