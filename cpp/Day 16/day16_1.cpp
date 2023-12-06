// Accept two  numbers from user and print addtion,subtraction,multiplication,division.
// use exception handling for divide by zero.

#include<iostream>
using namespace std;

int main(){

    int a,b;

    cout<<endl<<"enter 2 numbers : "<<endl;
    cin>>a>>b;

   try{
    
    if(b==0){
        throw 101;
    }
     cout<<"Division of a and b is : "<<a/b<<endl;
   }
    catch(int error){
        
        cout<<endl<<"Error "<<error<<endl;
        cout<<"Enter valid number...!"<<endl;

    }

    cout<<"addition of a and b is : "<<a+b<<endl;


    cout<<"multiplication of a and b is : "<<a*b<<endl;


    cout<<"substraction of a and b is : "<<a-b<<endl;


}