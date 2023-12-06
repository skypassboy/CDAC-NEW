#include<iostream>
#include<fstream>

using namespace std;

int main(){

    ofstream fout;

    fout.open("C:\\test\\abc.txt");
    if(!fout){
        cout<<"Error";
        return -1;
    }
    for(int i=65;i<90;i++){
        fout.put(char(i));
        fout.put(' ');

    }   
    fout.close(); 
}
