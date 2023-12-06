// complex class


#include<iostream>
using namespace std;

class Complex{
    int real , imaginary;
    public:
        Complex();
        Complex(int, int);
        void display() const;
        int getReal() const;
        int getImg() const;

        };

    Complex ::Complex(){
        real=imaginary=10;
    };

    Complex::Complex(int r , int i){
        real = r;
        imaginary = i;
    };

    int Complex ::getReal() const{

        return real;
    };

    int Complex ::getImg() const{
        return imaginary;
    };

    void Complex:: display() const{
        cout<<endl<<"Real : "<<real<<"   "<<"Imaginary :"<<imaginary<<endl;
    };

int main(void){

    int i;
    int r;


    const Complex c1;
    c1.display();
    i=c1.getImg();
    r=c1.getReal();

    cout<<endl<<"Real = "<<r<<endl;

    const Complex c2(20,31);
    c2.display();
    i=c2.getReal();
    r=c2.getImg();
    cout<<endl<<"Real = "<<r<<endl;


}