// Overloaded == operator

#include<iostream>

using namespace std;

class Complex {
    int real, imag;

public:
    Complex();
    Complex(int, int);
    void display();
    
    // Overload the == operator
    bool operator==(Complex& );
};

Complex::Complex() {
    real = imag = 12;
}

Complex::Complex(int real, int imag) {
    this->real = real;
    this->imag = imag;
}

void Complex::display() {
    cout << endl << real << " " << imag << endl;
}

// Overloaded == operator
bool Complex::operator==(Complex& other) {
    return (this->real == other.real) && (this->imag == other.imag);
}

int main() {
    Complex c1;
    c1.display();

    Complex c2(12, 13);
    c2.display();

    Complex c3(12, 13);

    // Check if c2 and c3 are equal using the == operator
    if (c2 == c3) {
        cout << "c2 and c3 are equal." << endl;
    } else {
        cout << "c2 and c3 are not equal." << endl;
    }

    return 0;
}