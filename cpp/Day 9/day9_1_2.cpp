// operator overloading pre increment


#include<iostream>

using namespace std;

class Complex{

    int real,imag;
    public:

        Complex();
        Complex(int,int);
        void display();
        Complex operator++();
};

Complex :: Complex(){
    real=imag=12;
}

Complex ::Complex(int real,int imag){
    this->real = real;
    this->imag = imag; 
}

Complex Complex ::operator++(){
    Complex c3;
    c3.real = ++this->real;
    c3.imag = ++this->imag;
    return c3;
};

void Complex ::display(){

    cout<<endl<<real<<" "<<imag<<endl;

}

int main(){

    Complex c1;
    c1.display();

    Complex c2(12,13);
    c2.display();

    Complex c3;
    c3 = ++c2;
    c3.display(); 

}


