// < operator overload

#include<iostream>
using namespace std;

class Box{

    int height,width,depth;
    public:
    Box();
    Box(int, int, int);
    void display();
    int volume();
    bool operator<(Box &);

};

bool Box::operator<(Box &a){

    if((this->volume())<(a.volume())){
        return true;
    }
    else{
        return false;
    }


}
Box ::Box(){
    height=0;
    width=0;
    depth=0;
}

Box::Box(int height, int width, int depth){

    this->height=height;
    this->width=width;
    this->depth=depth;

}


void Box :: display(){
    
    cout<<"Height width and depth of box is "<<height<<" "<<width<<" "<<depth<<" Respectively"<<endl;
    cout<<endl<<volume()<<endl;
}

int Box :: volume(){
    int volm;
    volm=depth*height*width;
    return volm;
};

int main(){
    Box b1(12,13,12);
    b1.display();
    // b1.volume();

    Box b2(10,10,10);
    b2.display();
    // b2.volume();

    if(b1<b2){
        cout<<"b1<b2"<<endl;
    }
    else{
        cout<<"b2<b1"<<endl;
    };
}
