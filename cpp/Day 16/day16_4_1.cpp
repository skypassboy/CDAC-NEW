// program to demonstrate use of static cast


#include <iostream>

using namespace std;

int main() {
    // Example 1: Widening Conversion (int to double)
    int intValue = 42;
    double doubleValue = static_cast<double>(intValue);

    cout << "Widening Conversion:" << endl;
    cout << "int value: " << intValue << endl;
    cout << "double value: " << doubleValue << endl;

    // Example 2: Narrowing Conversion (double to int)
    double doubleValue2 = 3.14159;
    int intValue2 = static_cast<int>(doubleValue2);

    cout << "\nNarrowing Conversion:" << endl;
    cout << "double value: " << doubleValue2 << endl;
    cout << "int value: " << intValue2 << endl;

    // Example 3: Using static_cast to change the type of a pointer
    double* ptrToDouble = &doubleValue;
    int* ptrToInt = static_cast<int*>(static_cast<void*>(ptrToDouble));

    cout << "\nPointer Conversion:" << endl;
    cout << "ptrToDouble: " << ptrToDouble << endl;
    cout << "ptrToInt: " << ptrToInt << endl;

    return 0;
}
