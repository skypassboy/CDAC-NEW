#include<iostream>
#include<fstream>

using namespace std;

#include<iostream>
#include<fstream>

using namespace std;

int main(){
    ifstream fin("C:\\Users\\Ritesh\\Desktop\\CDAC\\PG-DAC\\cpp programs\\Day 17\\day17_3.cpp");
    char ch;
    int count=0;
    int noOfcharacter = 0;
    while(fin){
        ch = fin.get();
        
        if(ch==10){
            count++;
        }

        if(ch!=32){
            noOfcharacter++;
        }

        cout<<ch;
    }
    cout<<endl<<"Number of spaces is: "<<count<<endl;
    cout<<endl<<"Number of characters is: "<<noOfcharacter<<endl;
    fin.close();
}