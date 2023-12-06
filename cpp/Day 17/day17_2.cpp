#include<iostream>
#include<fstream>

using namespace std;

int main(){
    ofstream fout("C:\\Users\\Ritesh\\Desktop\\test1\\pqr.txt");
    ifstream fin("C:\\test\\abc.txt");

    char ch;
    while(fin){
        ch = fin.get();
        fout.put(ch);
    }
    fout.close();
    fin.close();
}