// Function overloading 
// name should be same return type can be different 


#include<iostream>
#include<string.h>

using namespace std;

void fun1(int a){

    cout<<endl<<"Inside fun1(int a)"<<endl;

}
void fun1(int a, int b){

    cout<<endl<<"Inside fun1(int a,int b)"<<endl;

}

void fun1(int a,float b){

    cout<<endl<<"Inside fun1(int a,float b)"<<endl;

}


int main(void){

    fun1(23);
    fun1(23,24);
    fun1(23,26.4f);

}