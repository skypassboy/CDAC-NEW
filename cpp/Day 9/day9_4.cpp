// Create class String with data member int length and char pointer.Implement following
// 1. Default Constructor
// 2. Parameterized Constructor
// 3. Copy Constructor
// 4. Destructor.


// string class

#include<iostream>  
#include<string.h>

using namespace std;

class String{

    int length;
    char *str;
    public:
        String();
        String(const char *);
        ~String();
        void display();
        String(String &);

};

String ::String( String &r){
    this->length = r.length;
    this->str = new char[r.length+1];
    strcpy(str,r.str);

}


String::String(){

    length=1;
    str = new char[length];
    str[0] = '\0';


}
void String ::display(){
    cout<<endl<<str<<" "<<length;
}

String ::String(const char *str){
    this->length = strlen(str);
    this->str = new char[this->length+1];
    strcpy(this->str,str);

}

String:: ~String(){
    cout<<endl<<"destructor called..."<<endl;
    delete[]str;
}

int main(){

    String s1;
    s1.display();


    String s2("Ritesh");
    s2.display();

    String s3=s2;
    s3.display();

}

