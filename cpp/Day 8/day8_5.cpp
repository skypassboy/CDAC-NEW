#include<iostream>
#include<string>
#include<string.h>

using namespace std;

class BankAccount{
    int acNo;
    string name;
    int balance;
    static float interestRate;
    static int count;
    public:
        BankAccount();
        BankAccount(string, int);
        static void setInterestRate();
        void display();

};

int BankAccount ::count=0;

float BankAccount:: interestRate;

void BankAccount::setInterestRate(){
            interestRate=12.3;
    }

void BankAccount::display(){
    cout <<endl<<"Bank Details"<<endl;
    cout<<endl<<acNo<<endl;
    cout<<endl<<name<<endl;
    cout<<endl<<balance<<endl;
    cout<<endl<<interestRate<<endl;
}
BankAccount ::BankAccount(){
        count++;
        acNo=count;
        name="";
        balance=0;
        interestRate=0;

}

BankAccount :: BankAccount(string n,int bal){
        count++;
        acNo=count;
        name=n;
        balance=bal;
        // interestRate=ir;
}

int main(){

    BankAccount b1;
    b1.setInterestRate();
    b1.display();

    BankAccount b2("Ritesh",20000);
    b2.setInterestRate();
    b2.display();

}


