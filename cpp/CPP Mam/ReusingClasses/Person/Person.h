#include"Date.h"
#include"str.h"
class Person
{
    cString name;
    Date bdate;
    public:
    Person();
    Person(const char*,int,int,int);
    void Display();
};