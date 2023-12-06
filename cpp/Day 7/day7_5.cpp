#include<iostream>
using namespace std;
class Point{
    public :
        int x;
        int y;
        void accept();
        void display();
        
};

void Point :: accept(){
    cout<<"Enter value of x and y : "<<endl;
    cin>>x>>y;
}

void Point :: display(){
    cout<<"Entered values of x and y are " <<"["<<x<<","<<y<<"]"<<endl;
}

int main(){
    
    Point coordinates;
    coordinates.accept();
    coordinates.display();

}