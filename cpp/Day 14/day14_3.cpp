// template

#include<iostream>

using namespace std;

template<class T>
void Swap(T &a, T &b){
    T temp;
    temp = a;
    a=b;
    b=temp;
}



int main(){
    int no1=20;
    int no2=23;

    cout<<endl<<no1<<" "<<no2<<endl;

    Swap(no1,no2);

    cout<<endl<<no1<<" "<<no2<<endl;

}