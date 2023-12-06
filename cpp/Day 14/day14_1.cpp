
#include <iostream>
#include <string.h>
using namespace std;

// person class
class Person
{
    char name[20];
    int age;

public:
    Person();
    Person(const char *, int);
    virtual void display();
};

Person::Person()
{
    int age = 18;
    strcpy(name, "NA");
}

Person ::Person(const char *nm, int age)
{
    this->age = age;
    strcpy(name, nm);
}

void Person::display()
{
    cout << endl
         << "Name : " << name << endl;
    cout << endl
         << "Age : " << age << endl;
}
// employee class

class Emp : public Person
{
    int empid;

protected:
    double salary;

public:
    Emp();
    Emp(int, double, int, const char *);
    void display();
    virtual int calculateSal() = 0;
};

Emp::Emp()
{
    empid = 1;
    salary = 0;
}

Emp::Emp(int empid, double salary, int age, const char *nm) : Person(nm, age)
{
    this->empid = empid;
    this->salary = salary;
}

void Emp::display()
{
    Person::display();
    cout << endl
         << "Emp id : " << empid << endl;
    cout << endl
         << "Salary : " << salary << endl;
}

// wage employee class

class WageEmp : public Emp
{

    float hrs, rate;

public:
    WageEmp();
    WageEmp(float, float, const char *, int, int, double);
    void display();
    int calculateSal();
};

int WageEmp::calculateSal()
{
    double sal = salary + (hrs * rate);
    return sal;
}

WageEmp::WageEmp()
{
    hrs = 0;
    rate = 0;
}

WageEmp ::WageEmp(float hrs, float rate, const char *nm, int empid, int age, double salary) : Emp(empid, salary, age, nm)
{

    this->hrs = hrs;
    this->rate = rate;
}

void WageEmp::display()
{

    Emp::display();
    cout << endl
         << "Hrs : " << hrs << endl;
    cout << endl
         << "Rate : " << rate << endl;
    cout << endl
         << "Employee salary : " << calculateSal() << endl;
}

// sales person class

class SalesPerson : public Emp
{

    int noofsales, commission;

public:
    SalesPerson();
    SalesPerson(int, int, const char *, int, int, double);
    void display();
    int calculateSal();
};

int SalesPerson::calculateSal()
{
    return salary + noofsales + commission;
}

SalesPerson ::SalesPerson()
{
    noofsales = 0;
    commission = 0;
}

SalesPerson::SalesPerson(int noofsales, int commission, const char *nm, int empid, int age, double salary) : Emp(empid, salary, age, nm)
{
    this->noofsales = noofsales;
    this->commission = commission;
}

void SalesPerson::display()
{

    Emp::display();
    cout << endl
         << "noofsales : " << noofsales << endl;
    cout << endl
         << "commission : " << commission << endl;
    cout << endl
         << "Salary of Sales Person is :" << calculateSal() << endl;
}

// mananger class
class Manager : public Emp
{

    int TA, HRA;

public:
    Manager();
    Manager(int, int, const char *, int, int, double);
    void display();
    int calculateSal();
};

int Manager::calculateSal()
{
    return salary + TA + HRA;
}

Manager ::Manager()
{
    TA = 0;
    HRA = 0;
}

Manager::Manager(int TA, int HRA, const char *nm, int empid, int age, double salary) : Emp(empid, salary, age, nm)
{
    this->TA = TA;
    this->HRA = HRA;
}

void Manager::display()
{

    Emp::display();
    cout << endl
         << "TA : " << TA << endl;
    cout << endl
         << "HRA : " << HRA << endl;
    cout << endl
         << "Salary of Manager is :" << calculateSal() << endl;
}

// main function

int main()
{

    // WageEmp W(20,25,"Ritesh",101,25,90000);
    // W.display();

    // SalesPerson S(1000,50000,"Atharv",102,25,500000);
    // S.display();

    // Manager M(150,5000,"swapnil",103,25,900000);
    // M.display();

    Person *ptr[4];

    ptr[0] = new Person("Ritesh",25);
    ptr[1] = new Manager(100,20,"RItz",1,25,90000);
    ptr[2] = new SalesPerson(20,25,"Ath",2,26,100000);
    ptr[3] = new WageEmp(20,25,"nikhil",3,26,20000);

    for(int i=0; i<4;i++ ){
        ptr[i]->display();
    }

    cout<<endl<<"****************************************************************************************"<<endl;

    Emp *e[3];

    e[0] = new Manager(100,20,"RItz",1,25,90000);
    e[1] = new SalesPerson(20,25,"Ath",2,26,100000);
    e[2] = new WageEmp(20,25,"nikhil",3,26,20000);

    for(int i=0; i<3;i++ ){
        e[i]->display();
        cout<<endl<<"*******************************************"<<endl;
    }

}