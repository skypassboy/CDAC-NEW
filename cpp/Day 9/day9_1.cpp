// operator overloading + operator


#include <iostream>


using namespace std;

class Complex
{

    int real;
    int imag;

public:
    Complex();
    Complex(int, int);
    Complex operator+(Complex&);
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

Complex Complex:: operator+(Complex &r)
{

    Complex c3;
    c3.real = this->real + r.real;
    c3.imag = this->imag + r.imag;

    return c3;
}

int main()
{

    Complex c1(10, 20);
    c1.display();

    Complex c2(2, 4);
    c2.display();

    Complex c3 = c1 + c2;

    c3.display();
}
