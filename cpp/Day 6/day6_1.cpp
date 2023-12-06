#include<iostream>
using namespace std;
int multiply(int=1,int=1,int=1);
int main(){

    int a , b , c;
    int result;
    int choise;
    cout<<"How many arguments you want to pass ? ";
    cin>>choise;


    if(choise==3){
        cout<<"Enter value of a :";
    cin>>a;

    cout<<"Enter value of b :";
    cin>>b;

    cout<<"Enter value of c :";
    cin>>c;

    result = multiply(a,b,c);
    cout<<"result with three arguments "<<result;
    }
    else if(choise==2){

    cout<<"Enter value of b :";
    cin>>b;

    cout<<"Enter value of c :";
    cin>>c;

    result = multiply(b,c);
    cout<<"result with two argument "<<result;
    }
    else if(choise==1){

    cout<<"Enter value of c :";
    cin>>c;

    result = multiply(a,b,c);
    cout<<"result with single argument "<<result;
    }
    
}


int multiply(int a, int b, int c){
    int result;
    result=a*b*c;
    return result;
}
