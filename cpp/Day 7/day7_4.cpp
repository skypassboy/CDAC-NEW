#include<iostream>
using namespace std;

class Box{
    public:
    int height,width,depth;
    void display();
    void volume();
};

void Box :: display(){
    
    cout<<"Height width and depth of box is "<<height<<" "<<width<<" "<<depth<<" Respectively"<<endl;
}

void Box :: volume(){
    
    cout<<"volume of Box is "<<depth*height*width<<endl;
};

int main(){
    Box b1;
    b1.height=10;
    b1.width=12;
    b1.depth=15;
    b1.display();
    b1.volume();
}
