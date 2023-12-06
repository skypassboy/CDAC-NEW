// overloading  = operator in string class

#include<iostream>
#include<string.h>

using namespace std;

class String {
private:
    int length;
    char* str;

public:
    String();
    String(const char*);
    ~String();
    void display();
    String(const String&);

    // Overload the assignment operator
    String& operator=(String&);
};

String::String(const String& r) {
    this->length = r.length;
    this->str = new char[this->length + 1];
    strcpy(str, r.str);
}

String& String::operator=(String& other) {
    if (this == &other) {
        return *this; // Self-assignment, no need to do anything
    }

    // Deallocate existing resources
    delete[] str;

    // Copy length
    this->length = other.length;

    // Allocate new memory and copy the string
    str = new char[this->length + 1];
    strcpy(this->str, other.str);

    return *this; // Return *this to allow for chaining assignments
}

String::String() {
    length = 1;
    str = new char[length];
    str[0] = '\0';
}

String::~String() {
    cout << "Destructor called..." << endl;
    delete[] str;
}

void String::display() {
    cout << endl << str << " " << length;
}

String::String(const char* str) {
    this->length = strlen(str);
    this->str = new char[this->length + 1];
    strcpy(this->str, str);
}

int main() {
    String s1;
    s1.display();

    String s2("Ritesh");
    s2.display();

    String s3 = s2;
    s3.display();

    String s4;
    s4 = s2;
    s4.display();

    return 0;
}
