// string class
// destructor
// copy constructor
// = operator overload

#include<iostream>
#include<string.h>

using namespace std;

class String{
    
    int length;
    char *name;
    public:
        String();
        String(const char*);
        String(String &);
        String& operator=(const String&);
        void display();
        ~String();

};

String :: String(){
    this->length = 0;
    name = new char[this->length+1];
    name[0] = '\0';
}

String::String(const char *name){

    this->length = strlen(name);
    this->name = new char[strlen(name)+1];
    strcpy(this->name,name);

}

String :: String(String &str){

    this->length = str.length;
    strcpy(this->name,str.name);

}

String& String :: operator=(const String& other){

    if(this==&other){
        return *this;
    }

    delete [] name;

    this->length = other.length;
    this->name = new char[this->length + 1];
    strcpy(this->name,other.name);
    return *this;
}

void String :: display(){
    cout<<endl<<"Name : "<<name<<endl;
    cout<<endl<<"Length : "<<length<<endl;
}

String::~String(){
    delete []name;
}

int main(){

    String s1;
    s1.display();

    String s2("ritesh");
    s2.display();

}