#include<iostream>
#include<fstream>

using namespace std;

#include<iostream>
#include<fstream>

using namespace std;

int main(){
    ifstream fin("C:\\Users\\Ritesh\\Desktop\\test1\\pqr.txt");
    char ch;
    int count=0;
    int noOfcharacter = 0;
    while(fin){
        ch = fin.get();
        
        if(ch==' '){
            count++;
        }

        if(ch!=32){
            noOfcharacter++;
        }
    }
    cout<<endl<<"Number of spaces is: "<<count<<endl;
    cout<<endl<<"Number of characters is: "<<noOfcharacter<<endl;
    fin.close();
}