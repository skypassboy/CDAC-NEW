#include<iostream>
using namespace std;

int main12()
{
    int a,b;
    float res;
    cout<<"\n\n\t Enter Two Values ";
    cin>>a>>b;
    
    try{
        if(b==0)
         throw 100;
        res=a/b;
        cout<<"\n\n\t Restult : "<<res;
    }
    catch(int no)
    {
        cout<<"\n\t Int Catch Block"<<no;
    }
    res=a+b;
    cout<<"\n\n\t Addition : "<<res;
    
    res=a-b;
    cout<<"\n\n\t Subtraction : "<<res;
    
    res=a*b;
    cout<<"\n\n\t Multiplication : "<<res;
    
    cout<<"\n\n\n";
    return 0;
}