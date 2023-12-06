#include<iostream>
using namespace std;

class Date{
    private:
    int day,month,year;
    public:
    void setDate(int,int,int);
    void getDate();
};

void Date ::setDate(int d, int m, int y){
    day = d;
    month = m;
    year = y;
};

void Date ::getDate(){

    cout<<" Date : "<<day<<"/"<<month<<"/"<<year<<endl;

}

int main(){
    Date d1;
    d1.setDate(14,9,2023);
    d1.getDate();
}