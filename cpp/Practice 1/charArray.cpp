#include<iostream>
#include<string.h>

using namespace std;

class CharArray{

    int length;
    char name [20];
    public:
        CharArray();
        CharArray(const char *);
        void display();
};

CharArray::CharArray(){
    length= 0;
    strcpy(name,"NA");
}
CharArray::CharArray(const char *name){

    this->length = strlen(name);
    strcpy(this->name,name);

}

void CharArray::display(){

    cout<<endl<<"length : "<<length<<endl;
    cout<<endl<<"Name : "<<name<<endl;

}

int main(){

    CharArray c1;
    c1.display();

    CharArray c2("Ritesh");
    c2.display();

}