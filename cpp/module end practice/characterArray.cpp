#include<iostream>
#include<math.h>
#include<string.h>
using namespace std;



void displaybysubscript(char name[]){
    cout<<endl<<name<<endl;
}
void displaybypointer(char *name){
    cout<<endl<<name<<endl;
}

void show(char* str){

    str = new char[20];
    strcpy(str,"Ritesh");
    cout<<endl<<str<<endl;

    delete[] str;
}
int main(void){

    char name[20]="Ritesh Patil";
    // how to pass char array to function by array subscript or array name...
    displaybysubscript(name);

    // how to pass char array to function by pointer notation...
    displaybypointer(name);


    char* str;

    show(str);
    
   
}