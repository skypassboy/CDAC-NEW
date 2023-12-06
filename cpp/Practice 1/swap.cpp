#include<iostream>

using namespace std;


void Swap(int *a ,int *b){
    int temp;
    temp=*a;
    *a=*b;
    *b=temp;
}



int main(){

    int a=10;
    int b=20;

    cout<<endl<<a<<" "<<b<<endl;
    Swap(&a,&b);
    cout<<endl<<a<<" "<<b<<endl;
}