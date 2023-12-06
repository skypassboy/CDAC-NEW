#include<iostream>
#include<math.h>

using namespace std;

class Demo{

    int trial=1;

    public:
        Demo(){
            trial=0;
        };

        Demo(int trial){
            this->trial= trial;
        }
        void display(){
            cout<<trial;
        }
    // it will give error if we try to change value of declared variable in constant function we cant do that
        int demo(int a) const{
            trial=a;
            return trial;
        }            
        

};



int main(void){

    Demo d;
    d1.
    Demo d1;
    cout<<d1.demo(10);


}