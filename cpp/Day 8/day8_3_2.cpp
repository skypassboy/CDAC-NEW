

#include<iostream>
#include<string>
using namespace std;

class Player {
    int player_id;
    string player_name;
    int runs;
    int wickets;
    int innings;

public:
    void display();
    Player();
    Player(int, string, int, int, int);

    int getRuns() const { return runs; }
    int getWickets() const { return wickets; }
};

Player::Player() {
    player_id = 0;
    player_name = "";
    runs = 0;
    wickets = 0;
    innings = 0;
}

Player::Player(int p_id, string p_n, int r, int wkts, int inn) {
    player_id = p_id;
    player_name = p_n;
    runs = r;
    wickets = wkts;
    innings = inn;
}

void Player::display() {
    cout << "Player id: " << player_id << endl;
    cout << "Player name: " << player_name << endl;
    cout << "Runs: " << runs << endl;
    cout << "Wickets: " << wickets << endl;
    cout << "Innings: " << innings << endl;
}

// Global function
void displayPlayerWithMaxRunsAndWickets(Player obj[], int size) {
    int maxRuns = -1;
    int maxWickets = -1;
    int maxRunsPlayerIndex = -1;
    int maxWicketsPlayerIndex = -1;

    //player with the maximum runs and wickets
    for (int i = 0; i < size; i++) {
        if (obj[i].getRuns() > maxRuns) {
            maxRuns = obj[i].getRuns();
            maxRunsPlayerIndex = i;
        }

        if (obj[i].getWickets() > maxWickets) {
            maxWickets = obj[i].getWickets();
            maxWicketsPlayerIndex = i;
        }
    }

    // player with the maximum runs
    cout << "Player with maximum runs:" << endl;
    obj[maxRunsPlayerIndex].display();

    // Display the player with the maximum wickets
    cout << "\nPlayer with maximum wickets:" << endl;
    obj[maxWicketsPlayerIndex].display();
}

int main() {
    Player obj[3];
    int p_id, r, wkts, inn;
    string p_n;

    for (int i = 0; i < 3; i++) {
        cout << "Enter player details for player " << i + 1 << endl;
        cout << "Enter player id: ";
        cin >> p_id;
        cout << "Enter name: ";
        cin.ignore();
        getline(cin, p_n);
        cout << "Enter runs: ";
        cin >> r;
        cout << "Enter wickets: ";
        cin >> wkts;
        cout << "Enter innings: ";
        cin >> inn;
        obj[i] = Player(p_id, p_n, r, wkts, inn);
    }

    // Call the global function
    displayPlayerWithMaxRunsAndWickets(obj, 3);

    return 0;
}
