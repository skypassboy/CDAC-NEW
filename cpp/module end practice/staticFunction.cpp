// static function


#include<iostream>
#include<string.h>

using namespace std;

class Demo{

static int a;

public:

    static void fun(){
        cout<<endl<<"Inside static void fun..."<<endl;
    }


};

int Demo:: a;


int main(){

Demo d1;
d1.fun();

Demo :: fun();


}