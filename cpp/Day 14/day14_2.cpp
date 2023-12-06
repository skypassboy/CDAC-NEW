#include <iostream>
#include <string.h>
#include <math.h>

using namespace std;

class Shape
{
    long area, perimeter;

public:
    virtual long calArea() = 0;
    virtual long calPerimeter() = 0;
    virtual void display();
};

void Shape::display()
{
    area = 0;
    perimeter = 0;
}

// square class

class square : public Shape
{
    long side;

public:
    square()
    {
        side = 0;
    }
    square(long side)
    {
        this->side = side;
    }

    long calArea();
    long calPerimeter();
    void display();
    void displaySide();
};

long square::calPerimeter()
{
    return 4 * side;
}

long square::calArea()
{
    return side * side;
}

void square ::display()
{

    cout << endl
         << "Area of Square : " << calArea() << endl;
    cout << endl
         << "Perimeter of Square : " << calPerimeter() << endl;
}
void square :: displaySide(){
    cout<<"in square class display side method";
}
// triangle class

class triangle : public Shape
{
    long base, height;

public:
    triangle()
    {
        base = 0;
        height = 0;
    }
    triangle(long base, long height)
    {
        this->base = base;
        this->height = height;
    }
    long calArea();
    long calPerimeter();
    void display();
};

long triangle::calPerimeter()
{
    return base + height + sqrt((base * base) + (height * height));
}

long triangle::calArea()
{
    return base * height * 0.5;
}

void triangle ::display()
{

    cout << endl
         << "Area of triangle : " << calArea() << endl;
    cout << endl
         << "Perimeter of triangle : " << calPerimeter() << endl;
}

int main()
{

    Shape *s1;

    s1 = new square(50);
    square *sq = dynamic_cast<square*>(s1);
    sq->displaySide();
    s1->display();
    // s1->display();
}
