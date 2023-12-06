#include<iostream>
#include<string.h>

using namespace std;

class Player{
    int Player_id;
    char Player_name [20];
    public:
        Player();
        Player(int ,const char[]);
        void display();
};

Player::Player(){
    Player_id=0;
    strcpy(Player_name,"NA");
}

Player :: Player(int Player_id,const char Player_name[20] ){
    this->Player_id = Player_id;
    strcpy(this->Player_name,Player_name);
}

void Player::display(){

    cout<<endl<<"Player name : "<<Player_name<<endl;
    cout<<endl<<"Player id : "<<Player_id<<endl;

}

class batsman: public Player{
    private:
        int innings,notout,runs;
        public:
        float calcavg();
        batsman();
        batsman(int , const char[],int ,int ,int);
        void displaydata();
};

batsman::batsman(){

}

batsman ::batsman(int d , const char nm[20],int a, int b,int c):Player(d,nm){
    this->innings = a;
    this->notout = b;
    runs = c;
}

float batsman ::calcavg(){
    float avg = runs/(innings-notout);
    return avg;
}

void batsman :: displaydata(){
    // Player ::display();
    cout<<endl<<"Player innings : "<<innings<<endl;
    cout<<endl<<"player notouts : "<<notout<<endl;
    cout<<endl<<"Player runs : "<<runs<<endl;
    cout<<endl<<"player average : "<<calcavg()<<endl;

}

int main(){
    batsman b1(1,"Ritesh",2,10,500);
    b1.display();
    b1.displaydata();
}

