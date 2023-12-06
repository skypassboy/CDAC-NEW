#include"Complex.cpp"
int a=10;
int main()
{
    int a=5;
    cout<<" \n\n\n\t A: "<<a;
    a=a;
    cout<<" \n\n\n\t A: "<<a;
    Complex c1;
    c1.Display();

    Complex c2(2,3);
    c2.Display();

    Complex c3(20,30);
    c3.Display();
    

    Complex c4;
    c4=c2.Add(c3);
    c4.Display();


    int no=20;
    
    cout<<endl<<endl<<endl;
    return 0;
}