#include<iostream>
using namespace std;
#include"Person.h"
int main()
{
    Person p1;
    p1.Display();

    Person p2("Seeta",2,3,2000);
    p2.Display();
    cout<<"\n\n\n";
    return 0;
}
