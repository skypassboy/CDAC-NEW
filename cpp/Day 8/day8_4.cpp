// to count the object created



#include <iostream>
using namespace std;

class Point
{
    int x, y;

    static int cnt;

public:
    void display();
    Point();
    Point(int, int);
};
int Point::cnt;
Point ::Point()
{
    x = y = 20;
    cnt++;
}

Point ::Point(int a, int b)
{
    x = a;
    y = b;
    cnt++;
}

void Point ::display()
{

    cout << endl
         << "[" << x << "," << y << "]" << endl;
    cout << endl
         << "count of object created is : " << cnt;
}

int main()
{

    Point p1;
    p1.display();

    Point p2(4, 5);
    p2.display();
}
