// operator overloading post increment
#include <iostream>

using namespace std;

class Complex
{

    int real;
    int imag;

public:
    Complex();
    Complex(int, int);
    Complex operator++(int);
    void display();
};

Complex ::Complex()
{
    real = 12;
    imag = 15;
}

void Complex ::display()
{
    cout << endl << real << " " << imag << endl;
}

Complex ::Complex(int a, int b)
{
    real = a;
    imag = b;
}

Complex Complex:: operator++(int a)
{

    Complex c3;
    c3.real = this->real++;
    c3.imag = this->imag++;

    return c3;
}

int main()
{

    Complex c1(10, 20);
    c1.display();
    
    c1++;
    c1.display();

    Complex c2;
    c2.display();
}

