// complex class
// implement 5+c1 in complex class
// main

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

    friend Complex operator+(int,const Complex&);
};

Complex operator+(int no,const Complex &c){
        Complex temp;
        temp.real = no + c.real;
        temp.imaginary = c.imaginary;
        return temp;
}

Complex ::Complex()
{
    real = imaginary = 10;
};

Complex::Complex(int r, int i)
{
    real = r;
    imaginary = i;
};

// int Complex ::getReal() const
// {

//     return real;
// };

// int Complex ::getImg() const
// {
//     return imaginary;
// };

void Complex::display() const
{
    cout << endl<< "Real : " << real << " "<< "Imaginary :" << imaginary << endl;

   if(imaginary>0){
     cout<<"Complex no is : "<<real<<" + "<<imaginary<<"i"<<endl;
   }
   else{
     cout<<"Complex no is : "<<real<<imaginary<<"i"<<endl;
   }

};

int main(void)
{

    int i;
    int r;

    const Complex c1;
    c1.display();
    // i = c1.getImg();
    // r = c1.getReal();

    // cout << endl<< "Real = " << r << endl;
    // cout << endl<< "Imag = " << i << endl;

    const Complex c2(20, -31);
    c2.display();
    // i = c2.getReal();
    // r = c2.getImg();
    // cout << endl<< "Real = " << r << endl;
    // cout << endl<< "Imag = " << i << endl;

    const Complex c3 = 5+c1;
    c3.display();

}