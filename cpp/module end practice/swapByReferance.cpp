#include<iostream>
#include<math.h>

using namespace std;


void Swap(int &a,int &b){

    int temp=a;
    a=b;
    b=temp;

}

int main(void){

    

    int a=10;
    int b=20;


    cout<<endl<<"a : "<<a<<" "<<"b : "<<b<<endl;
  
    Swap(a,b);

    cout<<endl<<"a : "<<a<<" "<<"b : "<<b<<endl;

}