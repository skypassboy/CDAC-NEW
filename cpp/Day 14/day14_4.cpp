// search

#include<iostream>

using namespace std;

template<class T>
bool search(T a[], int size, T key){
    
    bool flag = false;
    for(int i =0;i<size;i++ ){
        if(a[i]==key){
            flag = true;
            break;
        }
    }
    return flag;
}



int main(){
    int key=6;
    
    int arr[5] = {1,2,3,4,5};

    bool res  = search(arr,5,key);

    if(res==1){
        cout<<"element found";
    }
    else{
        cout<<"element not found";
    }
   

}