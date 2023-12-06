#include<iostream>
#include<stdio.h>
using namespace std;
class Base
{
    public:
    virtual void Accept()
    {
        cout<<"\n\n\t Accept In Base Class";
    }
    virtual void Display()
    {
        cout<<"\n\n\t Display In Base Class";
    }
};
class Derive1:public Base{

     void Accept()
    {
        cout<<"\n\n\t Accept In Derive1 Class";
    }
     void Display()
    {
        cout<<"\n\n\t Display In Derive1 Class";
    }
};
class Derive2:public Base{

public:
     void Accept()
    {
        cout<<"\n\n\t Accept In Derive2 Class";
    }
     void Display()
    {
        cout<<"\n\n\t Display In Derive2 Class";
    }
    void Test()
    {
        cout<<"\n\n\t Only In Derive 2";
    }
};
class Derive3:public Base{
public:
     void Accept()
    {
        cout<<"\n\n\t Accept In Derive3 Class";
    }
     void Display()
    {
        cout<<"\n\n\t Display In Derive3 Class";
    }
};
int main()
{
     /*int a=10;
     int const*p=&a;
     int *ptr;
     //ptr=p;
     ptr=const_cast<int*>(p);
     *ptr=30;
     cout<<"\n\n\t A: "<<a;


*/

//************ Dynamic Cast ***********
/*
    Base *p[5];
    p[0]=new Base();
    p[1]=new Derive1();
    p[2]=new Derive3();
    p[3]=new Derive2();
    p[4]=new Derive2();
    for(int i=0;i<5;i++)
    {
        p[i]->Accept();
        p[i]->Display();
        //p[i]->Test();
        Derive2 *De=dynamic_cast<Derive2*>(p[i]);
        De->Test();

    }
*/
    char str[20]="Seeta";
     char *p=str;
     int *ptr;
     //ptr=p; 
     ptr=reinterpret_cast<int*>(p);
     cout<<"\n\n\t "<<p;
     cout<<"\n\n\t "<<ptr;
     printf("\n\n\t p: %s  ptr :%s ",p,ptr);
      


    cout<<"\n\n\n";
    return 0;
}