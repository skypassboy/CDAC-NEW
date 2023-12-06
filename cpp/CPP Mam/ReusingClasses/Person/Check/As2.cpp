#include<iostream>
using namespace std;

class Test
{
    int a=40;
    int &b=a;
    public:
    void Disply()
    {
        cout<<"\n\n\t Value Of A : "<<a;
        cout<<"\n\n\t Value Of B : "<<b;
    }
    /*Test():a(20)
    {
      a=10;
    }
    Test(const char *str)
    {
        cout<<"\n\n "<<str;
    }
    ~Test()
    {
        cout<<"\n\ndestructor";
        
    }*/
};
int main()
{
    Test t1;
    t1.Disply();
 
cout<<"\n\n\n";
return 0;
}