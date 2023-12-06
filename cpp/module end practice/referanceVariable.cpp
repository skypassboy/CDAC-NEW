#include<iostream>
#include<math.h>

using namespace std;

int main(void){

    int a=10;
    int b=20;

    int &p=a;

    // we cant do like below
    
    // &p=a;
    // &p=&b;
    // &p=b;

    // p=b;
    cout<<endl<<a<<endl;
    cout<<endl<<&p<<endl;
    cout<<endl<<&a<<endl;
    cout<<endl<<p<<endl;

}