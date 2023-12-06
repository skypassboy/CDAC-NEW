#include<iostream>
#include<fstream>

using namespace std;

class cEmployee{
    int empno;
    char name[20];
    double salary;
    public:
        cEmployee();
        cEmployee(int, char[], double);
}