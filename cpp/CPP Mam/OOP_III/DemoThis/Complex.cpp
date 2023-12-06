#include"complex.h"
Complex::Complex()
{
    real=img=1;
}
Complex::Complex(int real,int img)
{
    this->real=real;
    this->img=img;
}
Complex Complex::Add(Complex &c1)
{
    Complex temp;
    temp.real=this->real+c1.real;
    temp.img=this->img+c1.img;
    return temp;
}
void Complex::Display()const
{
    if(img<0)
    cout<<endl<<endl<<"\t Complex No : "<<real<<img<<"i";
    else
    cout<<endl<<endl<<"\t Complex No : "<<real<<"+"<<img<<"i";
}