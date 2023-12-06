#include<iostream>
#include<string.h>
using namespace std;
typedef struct student
{   
    int rollno;
    char name[25];
    int totalmarks;

   void accept(){
    
    cout<<"Enter roll no : ";
    cin>>rollno;

    cout<<"Enter name : ";
    cin>>name;

    cout<<"Enter total marks : ";
    cin>>totalmarks;

   }    

    void display(){

        cout<<"Roll no = "<<rollno<<endl;
        cout<<"Name = "<<name<<endl;
        cout<<"Total marks = "<<totalmarks<<endl;

    }
   
}st;
st maxMarksStudentDetails(st[],int );

int main(void){

    st s1[5];
    st maxStudent;
    for(int i=0;i<5;i++){
        s1[i].accept();
    }

    for(int i=0;i<5;i++){
        s1[i].display();
    }
    
    maxStudent = maxMarksStudentDetails(s1,5);
    maxStudent.display();
    return 0;
   
}

st maxMarksStudentDetails(st students[],int size){

        int maxMarks=students[0].totalmarks;
        st sto;

        for(int i=0;i<size;i++){
            if(maxMarks<students[i].totalmarks){
                maxMarks=students[i].totalmarks;
                sto=students[i];
            }
        }
    return sto;
}   




