// program to demonstrate use of const cast

#include <iostream>

using namespace std;

int main() {
    // Example 1: Removing const from a pointer
    const int constValue = 42;
    const int* constPtr = &constValue;

    // Attempting to modify a const int directly (will result in a compilation error)
    // *constPtr = 43;

    // Using const_cast to remove the const qualifier and modify the value
    int* nonConstPtr = const_cast<int*>(constPtr);
    *nonConstPtr = 43;

    cout << "Example 1:" << endl;
    cout << "Modified value: " << *nonConstPtr << endl;

    // Example 2: Adding const to a pointer
    int nonConstValue = 99;
    int* nonConstPtr2 = &nonConstValue;

    // Using const_cast to add const qualifier
    const int* constPtr2 = const_cast<const int*>(nonConstPtr2);

    // Attempting to modify the value through the const pointer (will result in a compilation error)
    // *constPtr2 = 100;

    cout << "\nExample 2:" << endl;
    cout << "Original value: " << *nonConstPtr2 << endl;

    return 0;
}
