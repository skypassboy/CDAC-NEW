#include<iostream>
#include<typeinfo>
using namespace std;
class Test
{

};
int main()
{
    int a=10,b=30;
    char str[20];
    char ch;
    Test t1;
    if(typeid(a)==typeid(b))
        cout<<"\n\t Same ";
    else
      cout<<"\n\t Not Same";

    cout<<"\n\nA : "<<typeid(a).name();
    cout<<"\n\nB : "<<typeid(b).name();
    cout<<"\n\nch: "<<typeid(ch).name();
    cout<<"\n\nt1: "<<typeid(t1).name();
    cout<<"\n\nstr: "<<typeid(str).name();
    cout<<"\n\nstr[0]: "<<typeid(str[0]).name();

    cout<<endl<<endl;
return 0;
}