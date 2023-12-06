// multilevel in heritance


# include<iostream>
# include<string.h>
using namespace std;
class math1
{
    int a,b;
    public:
    void Addition(int,int);
    void subtraction(int,int);
    void calculatearea(int c);
  
};
void math1::Addition(int a,int b)
{
    cout<<"\n\n Addition of two numbers are::"<<a+b;
}
void math1::subtraction(int a,int b)
{
       cout<<"\n\n subtraction of two numbers are::"<<a-b;

}
void math1::calculatearea(int r)
{
    cout<<"\n\n area of circle are::"<<3.14*r*r;

}
class math2
{
    int a,b;
    public:
    void multiplication(int,int);
    void division(int,int);
    void calculatearea(int c);
  
};
void math2::multiplication(int a,int b)
{
    cout<<"\n\n multiplication of two numbers are::"<<a+b;
}
void math2::division(int a,int b)
{
       cout<<"\n\n division of two numbers are::"<<a-b;

}
void math2::calculatearea(int s)
{
    cout<<"\n\n area of squrae are::"<<s*s;

}
class calculator:public math1 ,public math2
{

};
int main()
{
    calculator c1;
    c1.Addition(10,20);
    c1.subtraction(20,10);
    c1.multiplication(2,5);
   //error // c1.calculatearea();
   c1.math1::calculatearea(3);
   c1.math2::calculatearea(5);

}