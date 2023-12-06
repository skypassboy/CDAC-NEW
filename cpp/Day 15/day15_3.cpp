// string class
// destructor
// copy constructor
// = operator overload



// << operator overload
// >> operator overload



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

    // Overload the << and >> operators as friend functions
    friend ostream& operator<<(ostream& os, const String& str);
    friend istream& operator>>(istream& is, String& str);
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

// Define the friend function for overloading >> operator
istream& operator>>(istream& is, String& str) {
    char buffer[100]; // Assuming a maximum input length of 99 characters
    is >> buffer;
    str = String(buffer);
    return is;
}

int main() {
    String s1;
    s1.display();

    String s2("ritesh");
    s2.display();

    cout << "Using overloaded << operator: " << s2 << endl;

    cout << "Enter a string: ";
    cin >> s1;
    cout << "You entered: " << s1 << endl;

    return 0;
}
