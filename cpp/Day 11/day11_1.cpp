#include<iostream>
#include<string.h>
using namespace std;

class Book {
    static int bookid;
    char * bookname;
    float price;
    public:
        Book();
        Book(const char *,float);
        void display();
        Book(Book &);
        ~Book();
};

int Book :: bookid = 0;

    Book :: Book(){
        int bid;
        bookid++;
        bid=bookid;
        bookid=bid;
        
        price = 0;
        bookname = new char[1];
        bookname[0] = '\0';

    }
   Book :: Book( Book &r){
    
    this->bookname = new char[strlen(r.bookname)+1];
    strcpy(this->bookname,r.bookname);

    this->price = r.price;
    this->bookid = r.bookid;

}

    Book :: Book(const char* bookname,float price){
        bookid++;
        // this->bookname = new char[strlen(this->bookname)+1];
        this->bookname = new char[strlen(bookname)+1];
        strcpy(this->bookname,bookname);
        this->price = price;
    }

    Book ::~Book(){
        delete[]bookname;
    }

    void Book::display(){

        cout<<endl<<"Book id :"<<bookid<<endl;
        cout<<endl<<"Book name :"<<bookname<<endl;
        cout<<endl<<"Book price :"<<price<<endl;

    }

    int main(){

        Book b1;
        b1.display();

        Book b2("c++",1200);
        b2.display();

        Book b3("Java",1500);
        b3.display();

        Book b4=b3;
        b4.display();


    }
    
