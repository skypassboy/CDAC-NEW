//  Declare variable with built in data type like(int,char,float,char[]).
//    Declare class and check it's data type at runtime.
//    a.use typeid operator and check data type of all variable at runtime.
//    b.In same cpp file write note on typeinfo class typeid operator.


#include <iostream>
#include <typeinfo>

using namespace std;

int main() {
    int integerVariable = 42;
    char charVariable = 'A';
    float floatVariable = 3.14;
    char charArrayVariable[] = "Hello, World";

    // Using typeid operator to check data types
    cout << "Using typeid operator:" << endl;
    
    cout << "intVariable is of type: " << typeid(integerVariable).name() << endl;
    cout << "charVariable is of type: " << typeid(charVariable).name() << endl;
    cout << "floatVariable is of type: " << typeid(floatVariable).name() << endl;
    cout << "charArrayVariable is of type: " << typeid(charArrayVariable).name() << endl;

    return 0;
}
