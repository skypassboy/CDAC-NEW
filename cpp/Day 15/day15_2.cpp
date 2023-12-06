// string class
// destructor
// copy constructor
// = operator overload



// << operator overload

#include <iostream>
#include <cstring>

using namespace std;

class String {
    int length;
    char* name;

public:
    String();
    String(const char*);
    String(String&);
    String& operator=(const String&);
    void display();
    ~String();

    // Overload the << operator as a friend function
    friend ostream& operator<<(ostream& os, const String& str);
};

String::String() {
    this->length = 0;
    name = new char[this->length + 1];
    name[0] = '\0';
}

String::String(const char* name) {
    this->length = strlen(name);
    this->name = new char[strlen(name) + 1];
    strcpy(this->name, name);
}

String::String(String& str) {
    this->length = str.length;
    this->name = new char[this->length + 1];
    strcpy(this->name, str.name);
}

String& String::operator=(const String& other) {
    if (this == &other) {
        return *this;
    }

    delete[] name;

    this->length = other.length;
    this->name = new char[this->length + 1];
    strcpy(this->name, other.name);
    return *this;
}

void String::display() {
    cout << endl << "Name : " << name << endl;
    cout << "Length : " << length << endl;
}

String::~String() {
    delete[] name;
}

// Define the friend function for overloading << operator
ostream& operator<<(ostream& os, const String& str) {
    os << str.name;
    return os;
}

int main() {
    String s1;
    s1.display();

    String s2("ritesh");
    s2.display();

    cout << "Using overloaded << operator: " << s2 << endl;

    return 0;
}
