#include"Person.h"
Person::Person()
{

}
Person::Person(const char *str,int d,int m,int y):name(str),bdate(d,m,y)
{
    
}
void Person::Display()
{
    name.Display();
    bdate.Display();
}