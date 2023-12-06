#include<iostream>
#include<string.h>
using namespace std;
class Book
{
    int bid;
    char name[20];
    float price;
    public:
    Book();
    Book(int,const char*,float);
    void Display();
};
Book::Book()
{
    bid=0;
    strcpy(name,"NA");
    price=0;
}
Book::Book(int id,const char *nm,float pr)
{
    bid=id;
    strcpy(name,nm);
    price=pr;
}
void Book::Display()
{
    cout<<"\n\t Book Id   " <<bid;
    cout<<"\n\t Book name " <<name;
    cout<<"\n\t Book Price"  <<price;
}  

class PrintedBook:public Book
{
    float charges;
    public:
    PrintedBook();
    PrintedBook(int,const char*,float,float);
    void Display();

};
 PrintedBook::PrintedBook()
 {

 }
PrintedBook::PrintedBook(int id,const char *nm,float pr,float cha):Book(id,nm,pr)
{
    charges=cha;
}
void PrintedBook::Display()
{
    Book::Display();
    cout<<" Charges "<<charges;
}
int main()
{
    PrintedBook p1;
    p1.Display();
    PrintedBook p2(101,"Cprog",5000,30);
    p2.Display();
 
    cout<<"\n\n\n";


}