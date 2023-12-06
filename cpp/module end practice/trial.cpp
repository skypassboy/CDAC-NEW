#include<iostream>
#include<string.h>

using namespace std;


class base{

    int demo=10;
    public:

        virtual void display()=0;
        void display1(){
            cout<<demo;
        };
        virtual void display2(){
            cout<<"in display2...";
        }

};

class child: public base{
    int demoChild=20;
    public:
        void display(){
            cout<<demoChild;
        }
        void display2(){
            cout<<"in child display2..";
        }
};

int main(){ 

    base *b = new child();
    // base *b1 = new base();
        // b1->display();
        b->display();
        b->display1();
        b->display2();
        

}


// int main(){
//     base *b[2];
//     b[0]=new child();
//     b[0]->display1();
    
// }