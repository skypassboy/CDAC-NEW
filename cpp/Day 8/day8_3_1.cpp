
#include<iostream>
using namespace std;

class Player{
    int player_id;
    char player_name[40];
    int runs;
    int wickets;
    int innings;
    public:
        void display();
        Player();
        Player(int ,char [],int ,int,int);

};

Player ::Player(int p_id,char p_n[40],int r,int wkts,int inn){
    player_id = p_id;
    player_name[40]= p_n[40];
    runs = r;
    wickets = wkts;
    innings = inn;
};

void Player ::display(){
    cout<<endl<<"player id : "<<" "<<player_id<<endl;
    cout<<endl<<"player_name : "<<" "<<player_name<<endl;
    cout<<endl<<"runs : "<<" "<<runs<<endl;
    cout<<endl<<"wickets : "<<" "<<wickets<<endl;
    cout<<endl<<"innings : "<<" "<<innings<<endl;
};

int main(){

    Player obj[3];
    int p_id,r,wkts,inn;
    char p_n[40];
    
    for(int i=0;i<3;i++){

        cout<<endl<<"Enter player details : "<<" "<<i+1<<endl;
        cout<<endl<<"Enter player id :"<<endl;
        cin>>p_id;
        cout<<endl<<"Enter name : "<<endl;
        cin>>p_n;
        cout<<endl<<"Enter runs : "<<endl;
        cin>>r;
        cout<<endl<<"wickets : "<<endl;
        cin>>wkts;
        cout<<endl<<"innings : "<<endl;
        cin>>inn;
        obj[i]=Player(p_id,p_n,r,wkts,inn);
    }

    for (int i = 0; i < 3; i++) {
        cout << "\nDetails for player " << i + 1 << ":" << endl;
        obj[i].display();
    }



}

