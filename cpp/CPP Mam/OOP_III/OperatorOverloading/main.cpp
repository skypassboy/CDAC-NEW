#include"complex.cpp"
int main()
{
    { 
        cout<<"\n\t ********* Operator + ************";
    Complex c1(10,20),c2(2,3);
    Complex c3;
    c3=c1+c2;
    c1.Display();
    c2.Display();
    c3.Display();
    }
    {
        cout<<"\n\t ********* Operator - ************";
    Complex c1(10,20),c2(2,3);
    Complex c3;
    c3=c1-c2;
    c1.Display();
    c2.Display();
    c3.Display();
    }

    cout<<endl<<endl<<endl;
    return 0;
}