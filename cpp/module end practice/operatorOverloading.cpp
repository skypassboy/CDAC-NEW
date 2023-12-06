#include<iostream>
#include<string.h>

using namespace std;

class Complex{
    int real;
    int imag;
    public:
        Complex();
        Complex(int real, int imag);
        void display();
        Complex operator++();
};

Complex::Complex(){
    this->real=10;
    this->imag=12;
}
Complex::Complex(int real,int imag){
    this->real = real;
    this->imag = imag;
}

Complex Complex ::operator++(){

    Complex c;
    c.real = ++this->real;
    c.imag = ++this->imag;
    return c;

}

void Complex :: display(){
    cout<<"Real :"<<real<<" "<<"Imag :"<<imag;
}


int main(){

    Complex c1;
    c1.display();
    ++c1;
    c1.display();


}