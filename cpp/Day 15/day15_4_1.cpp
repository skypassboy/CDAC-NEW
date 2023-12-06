// complex class
// implement 5+c1 in complex class


#include <iostream>
using namespace std;

class Complex
{
    int real, imaginary;

public:
    Complex();
    Complex(int, int);
    void display() const;
    int getReal() const;
    int getImg() const;

    friend Complex operator+(int, const Complex&); // Change the parameter to const Complex&
};

Complex operator+(int no, const Complex& c)
{
    Complex temp;
    temp.real = no + c.real;
    temp.imaginary = c.imaginary;
    return temp;
}

Complex::Complex()
{
    real = imaginary = 10;
}

Complex::Complex(int r, int i)
{
    real = r;
    imaginary = i;
}

void Complex::display() const
{
    cout << endl << "Real : " << real << " " << "Imaginary :" << imaginary << endl;

    if (imaginary > 0)
    {
        cout << "Complex no is : " << real << " + " << imaginary << "i" << endl;
    }
    else
    {
        cout << "Complex no is : " << real << imaginary << "i" << endl;
    }
}

int main(void)
{
    const Complex c1;
    c1.display();

    const Complex c2(20, -31);
    c2.display();

    const Complex c3 = 5 + c1; // Now this should work correctly
    c3.display();

    return 0;
}
