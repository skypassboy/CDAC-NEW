// Accept five marks through command line argument
// and find maximum marks
// write function which will accept array of integer 
// and size of array as paramters . return maximum value 
// value from function.

#include<iostream>
using namespace std;

int FindMax(int a[],int size)
{
    return 10;
}

int main(int a,char *s[])
{
/*  s        arr
   0 .exe    10
   1 10      20 
   2 20      30
   3 30
   */
    int arr[5];
    if(a!=6)
    {
       cout<<" Invalid number of argumnets";
       return -1;
    }    
   
    for(int i=0;i<a;i++)
    {
        arr[i]=atoi(s[i+1]);
    }
    int mx=FindMax(arr,a-1);
    cout<<"\n\n\t MAx : "<<mx;

}