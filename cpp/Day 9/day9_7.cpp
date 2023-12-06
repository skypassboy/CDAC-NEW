// overloading [] operator

#include <iostream>
#include <cstring>

using namespace std;

class String {
private:
    int length;
    char *str;

public:
    String();
    String(const char *);
    String(const String &);
    ~String();
    void display();
    
    // The overloaded assignment operator has been removed

    // Overload the subscript operator
    char& operator[](int index);

    // Overload the const version of the subscript operator
    const char& operator[](int index) const;
};

String::String(const String &r) {
    this->length = r.length;
    this->str = new char[this->length + 1];
    strcpy(str, r.str);
}

String& String::operator=(const String &other) {
    if (this == &other) {
        return *this; // Self-assignment, no need to do anything
    }

    // Deallocate existing resources
    delete[] str;

    // Copy length
    length = other.length;

    // Allocate new memory and copy the string
    str = new char[length + 1];
    strcpy(str, other.str);

    return *this; // Return *this to allow for chaining assignments
}

char& String::operator[](int index) {
    if (index < 0 || index >= length) {
        // Handle out-of-bounds access here (e.g., throw an exception or return a default value)
        throw out_of_range("Index out of bounds");
    }
    return str[index];
}

const char& String::operator[](int index) const {
    if (index < 0 || index >= length) {
        // Handle out-of-bounds access here (e.g., throw an exception or return a default value)
        throw out_of_range("Index out of bounds");
    }
    return str[index];
}

// Rest of your String class remains the same

int main() {
    String s("Hello");
    
    // Using the subscript operator to access characters
    cout << s[0] << endl; // Should print 'H'
    cout << s[1] << endl; // Should print 'e'

    // Using the const version of the subscript operator
    const String cs("World");
    cout << cs[0] << endl; // Should print 'W'
    cout << cs[1] << endl; // Should print 'o'

    return 0;
}
