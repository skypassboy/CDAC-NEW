// date class

#include <stdio.h>
#include <iostream>

using namespace std;

class Date
{
    int day, month, year;

public:
    Date();
    Date(int, int);
    Date(int, int, int);
    void display();
};

Date ::Date()
{

    day = month = 1;
    year = 2023;
}

Date ::Date(int x, int y)
{

    day = month = x;
    year = y;
}

Date ::Date(int a, int b, int c)
{

    day = a;
    month = b;
    year = c;
}

void Date ::display()
{

    cout << "date :" << day << "-" << month << "-" <<year<<endl; 
}

int main(){

    Date d1;
    d1.display();

    Date d2(1,2015);
    d2.display();

    Date d3(12,5,2021);
    d3.display();

}