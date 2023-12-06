#include<iostream>
using namespace std;

typedef struct  Department
{
    int did;
    char dname[20];
    void Accept()
    {
        cout<<"\n\n\t Enter Department id and name ";
        cin>>did>>dname;
    }
    void Display()
    {
        cout<<"\n\t "<<did<<"\t"<<dname;
    }
}Dept;
int main()
{
    int numberofdepartments;
    Dept *departments;
    int i;
    cout<<"\n\t Enter Number Of Departments ";
    cin>>numberofdepartments;

    departments=new Dept[numberofdepartments];
    for(int i=0;i<numberofdepartments;i++)
    departments[i].Accept();

    for(int i=0;i<numberofdepartments;i++)
    departments[i].Display();

    delete [] departments;
    



    cout<<"\n\n\n";
    return 0;
}
