#include<iostream>
using namespace std;
class cStack
{
    int size,top;
    int *arr;
    public:
    cStack()
    {
        size=3;
        top=-1;
        arr=new int[size];
    }
    cStack(int s)
    {
        size=s;
        top=-1;
        arr=new int[size];
    }
    void Push(int no)
    {
        top++;
        arr[top]=no;
    }
    int Pop()
    {
        int no=arr[top];
        top--;
        return no;
    }
    void Display()
    {
        cout<<"\n\t ******* Stack Is \n\n";
        for(int i=top;i>=0;i--)
        cout<<"\n\t"<<arr[i];
    }
   
};
int main()
{
    int no,ch;
    cStack s1(5);
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
            cout<<"\n\n\t Enter Number ";
            cin>>no;
            s1.Push(no);
            break;
        case 2:
        no=s1.Pop();
        cout<<"\n\n\t Deleted Element Is : "<<no;
        break;
    case 3:
        s1.Display();
        break;
             
        }

        /* code */
    } while (ch!=0);

        
   
    
}