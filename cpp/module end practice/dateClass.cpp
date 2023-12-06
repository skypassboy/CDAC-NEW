#include<iostream>
#include<string.h>

using namespace std;

class Date{
    
    int day,month,year;
    public:
        Date();
        Date(int ,int ,int);
        void display();
        void setDate(int ,int ,int);
};

void Date::setDate(int day,int month,int year){

    this->day = day;
    this->month = month;
    this->year = year;

}

Date::Date(){
    day=month=1;
    year=2023;
}

Date::Date(int day, int month, int year){
    this->day=day;
    this->month=month;
    this->year=year;
}

void Date::display(){

    cout<<endl<<"Date : "<<day<<"-"<<month<<"-"<<year<<endl;

}

int main(void){

    // Date d1;
    // d1.display();

    // Date d2(10,12,2023);
    // d2.display();

    Date d[3];
    int day,month,year;
    for(int i=0;i<3;i++){
        
        cout<<endl<<"Enter Day"<<endl;
        cin>>day;

        cout<<endl<<"Enter Month"<<endl;
        cin>>month;

        cout<<endl<<"Enter Year"<<endl;
        cin>>year;

        d[i]=Date(day,month,year);
        

    }

    for(int i=0;i<3;i++){

        d[i].display();

    }


}