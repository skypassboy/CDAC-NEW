// dynamic memory allocation in array

#include <iostream>

using namespace std;

// Function to accept an array from the user
void acceptArray(int *arr, int size)
{
    cout << "Enter " << size << " elements:\n";
    for (int i = 0; i < size; ++i)
    {
        cin >> arr[i];
    }
}

// Function to display an array
void displayArray(const int *arr, int size)
{
    cout << "Array elements:\n";
    for (int i = 0; i < size; ++i)
    {
        cout << arr[i] << " ";
    }
    cout << endl;
}

// Function to find the maximum element in an array
int findMax(const int *arr, int size)
{
    int max = arr[0];
    for (int i = 1; i < size; ++i)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
    return max;
}

// Function to find the minimum element in an array
int findMin(const int *arr, int size)
{
    int min = arr[0];
    for (int i = 1; i < size; ++i)
    {
        if (arr[i] < min)
        {
            min = arr[i];
        }
    }
    return min;
}

// Function to search for a specific element in an array
bool searchElement(const int *arr, int size, int target)
{
    for (int i = 0; i < size; ++i)
    {
        if (arr[i] == target)
        {
            return true; // Element found
        }
    }
    return false; // Element not found
}

// Function to count even and odd numbers in an array
void countEvenOdd(const int *arr, int size, int &evenCount, int &oddCount)
{
    evenCount = 0;
    oddCount = 0;
    for (int i = 0; i < size; ++i)
    {
        if (arr[i] % 2 == 0)
        {
            evenCount++;
        }
        else
        {
            oddCount++;
        }
    }
}

int main()
{
    int size;
    cout << "Enter the size of the array: ";
    cin >> size;

    int *arr = new int[size];

    acceptArray(arr, size);
    displayArray(arr, size);

    int max = findMax(arr, size);
    int min = findMin(arr, size);

    cout << "Maximum element: " << max << endl;
    cout << "Minimum element: " << min << endl;

    int target;
    cout << "Enter the element you want to search for: ";
    cin >> target;

    if (searchElement(arr, size, target))
    {
        cout << "Element " << target << " found in the array.\n";
    }
    else
    {
        cout << "Element " << target << " not found in the array.\n";
    }

    int evenCount, oddCount;
    countEvenOdd(arr, size, evenCount, oddCount);
    cout << "Count of even numbers: " << evenCount << endl;
    cout << "Count of odd numbers: " << oddCount << endl;

    delete[] arr; // Deallocate memory

    return 0;
}
