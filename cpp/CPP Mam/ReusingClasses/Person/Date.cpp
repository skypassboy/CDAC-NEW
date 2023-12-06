#include"date.h"

Date::Date()
{
    day=month=1;
    year=2023;
}
 Date::Date(int d,int m,int y)
 {
    day=d;
    month=m;
    year=y;
 }
void Date::Display()const
{
    cout<<"\n\t Date    : "<<day<<"/"<<month<<"/"<<year;
}