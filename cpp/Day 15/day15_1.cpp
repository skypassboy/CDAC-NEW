// stack template main

#include<iostream>
using namespace std;
template<class T>
class cStack
{
    int size,top;
    T *arr;
    public:
    cStack()
    {
        size=3;
        top=-1;
        arr=new T[size];
    }
    cStack(int s)
    {
        size=s;
        top=-1;
        arr=new T[size];
    }
    void Push(T no)
    {
        if(top==size-1){
            cout<<"stack overflow..";
        }
        else{
             top++; 
            arr[top]=no;
           
        }

        // top++;
        // arr[top]=no;
    }
    T Pop()
    {
        if(top==-1){
            return 0;
        }
        else{
           
            T no=arr[top];
            top--;
            return no;
        }

            // int no=arr[top];
            // top--;
            // return no;
    }
    void Display()
    {
        cout<<"\n\t Stack Is \n\n";
        for(int i=top;i>=0;i--)
        cout<<"\n\t"<<arr[i];
    }
   
};
int main()
{
    int no;
    int ch;
    cStack<int> s1;
    
    do
    {
        cout<<"\n\n\1. Push\
                \n\t\t2. Pop\
                \n\t\t3. Display\
                \n\t\t0. Exit\
                \n\t Enter Your Choice ";
        cin>>ch;
        switch(ch)
        {
            case 1:
            cout<<"\n\n\t Enter value ";
            cin>>no;
            s1.Push(no);
            break;
        case 2:
        no=s1.Pop();
        
        if(no!=0){
            cout<<"\n\n\t Deleted Element Is : "<<no;
        }
        else{
            cout<<"Stack underflow...";
        }

        break;
    case 3:
        s1.Display();
        break;
             
        }

        /* code */
    } while (ch!=0);
 
}