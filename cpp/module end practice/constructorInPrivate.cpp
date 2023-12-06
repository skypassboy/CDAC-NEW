// constructor in private

// if we declare constructor in private then our public constructor must be parameterised to avoid ambiguity

#include<iostream>
#include<string.h>

using namespace std;

class Demo{

    int a=1;
    Demo(){
        cout<<endl<<"Inside Private constructor of Demo Class..."<<endl;
    }
    public:
        Demo(int x){
            Demo();
            cout<<"Inside public constructor of Demo Class...";

        }
        void display(){
            cout<<endl<<a<<endl;
        }
};


int main(){

    Demo d(12);
    d.display();
    

}