#include<iostream>
using namespace std;

class Person
{
    public:
    virtual void Display()
    {
        cout<<"\n\n\t In Class Person";
    }
};
class Emp:public Person
{
    public:
    void Display()
    {
        cout<<"\n\n\t In Class Emp";
    }
    
};
class Manager:public Emp
{
    public:
    void Display()
    {
        cout<<"\n\n\t In Class Manager";
    }
    void calSal()
    {
        cout<<"\n\n\t Cal Sal in Manager ";
    }
};
class WagEmp:public Emp
{
    public:
    void Display()
    {
        cout<<"\n\n\t In Class WageEmp";
    }
    void calSal()
    {
        cout<<"\n\n\t Cal Sal in WageEmp ";
    }
};

int main()
{
    Person *ptr;
    ptr=new Manager();
    ptr->Display();

    ptr=new WagEmp();
    ptr->Display();
   // ptr->calSal(); //searching fucntion in person
    // declare That function as virtual function in base class
    


   Emp *p;
   p=new Manager();
   p->Display();
  // p->calsal(); //Searching Function in Emp


    cout<<"\n\n\n";
    return 0;
}