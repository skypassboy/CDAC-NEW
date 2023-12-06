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
        Complex operator+(Complex& );
};


Complex Complex ::operator+(Complex& r){

    Complex temp;
    temp.real = this->real+r.real;
    temp.imag = this->imag + r.imag;
    return temp;

}

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
    cout<<endl<<"Real :"<<real<<" "<<"Imag :"<<imag<<endl;
}


int main(){

    Complex c1;
    c1.display();
    
    Complex c2(10,15);
    c2.display();

    Complex c3;

    c3= c1+c2;

    c3.display();

}