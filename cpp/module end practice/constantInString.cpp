#include<iostream>
#include<string.h>

using namespace std;

// Const keyword is mandatory when de declare string in double quotes

class Cstring{

    char * str;
    public:
        // Cstring();
        
        Cstring(const char *);
        void display();
    
};

Cstring::Cstring(const char *str){
    
    this->str = new char[20];
    strcpy(this->str,str);
}

void Cstring:: display(){
    cout<<str;
}


int main(){

    Cstring s1("seeta");
    s1.display();

}