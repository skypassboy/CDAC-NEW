// count no of digits make the sum of digits and reverse the number 

#include<iostream>
#include<math.h>

using namespace std;

int main(void){

    int no;
    int rev=0;
    int count=0;
    int sum=0;

    cout<<endl<<"Enter number :"<<endl;
    cin>>no;

    while(no!=0){
        count++;
            int lastdigit = no%10;
            rev=rev*10+lastdigit;
            sum= sum+lastdigit;
            no=no/10;
    }

    cout<<endl<<"no : "<<no<<endl;
    cout<<endl<<"rev : "<<rev<<endl;
    cout<<endl<<"count : "<<count<<endl;
    cout<<endl<<"sum : "<<sum<<endl;
    
}