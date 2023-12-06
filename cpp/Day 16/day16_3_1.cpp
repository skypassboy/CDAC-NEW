/*
2. Create class Employee with data type name.
  Derive classes Programmer,DataBaseAdministrator,SystemAdministrator.
  a. all classes has display and test functions.
  a. programmer class has function Codding();
  b. DataBaseAdministrator class has function CreateDataBase();
  c. SystemAdministrator class has function SystemUpdate();
  d. Create Array of Employee Pointer with size 5.
  e. Check name of all classes  at runtime.
  g. Excute class specific function from respective classes.
  
  * Pass this array to global function Check().
*/



// use of dynamic cast

#include<iostream>
using namespace std;
    
class Employee
{
    char name[20];
    public:
    virtual void Display()
    {
      cout<<"In the Employee Display"<<endl;
    }
    virtual void Test()
    {
      cout<<"In the Employee Test"<<endl;
    }
};
class Programmer:public Employee
{
  public:
    void Display()
    {
      cout<<"In the Programmer Display"<<endl;
    }
    void Test()
    {
      cout<<"In the Programmer Test"<<endl;
    }
    void Codding()
    {
      cout<<"In the Programmer Codding"<<endl;
    }
};
class DataBaseAdministrator:public Employee
{
    public:
    void Display()
    {
      cout<<"In the DataBaseAdministrator Display"<<endl;
    }
    void Test()
    {
      cout<<"In the DataBaseAdministrator Test"<<endl;
    }
    void CreateDataBase()
    {
      cout<<"In the DataBaseAdministrator CreateDataBase"<<endl;
    }
};
class SystemAdministrator:public Employee
{
    public:
    void Display()
    {
      cout<<"In the SystemAdministrator Display"<<endl;
    }
    void Test()
    {
      cout<<"In the SystemAdministrator Test"<<endl;
    }
    void SystemUpdate()
    {
      cout<<"In the SystemAdministrator SystemUpdate"<<endl;
    }
};
int main()
{
    Employee *e[5];
    e[0] = new Programmer();
    e[1] = new DataBaseAdministrator();
    e[2] = new SystemAdministrator();
    e[3] = new Programmer();
    e[4] = new SystemAdministrator();

    for(int i = 0; i < 5; i++)
    {
      e[i]->Display();
      e[i]->Test();
    
      cout<<"e["<<i<<"] is type of "<<typeid(e[i]).name()<<endl<<endl;

    Programmer *pg = dynamic_cast<Programmer*>(e[i]);

            pg->Codding();
    
    }

    return 0;
}