// Write a menu driven program for the following.. Count no of 1)charachters 2)spaces 3)vowels
#include <iostream>
using namespace std;
int charachter(char[]);
int spaces(char[]);
int vowels(char[]);
int main()
{
    int ch;
    char str[40];
    cout << "The string is" << endl;
    cin >> str;
    cout << "Choose number from 1 to 3" << endl;
    cin >> ch;
    int result1, result2, result3;
    switch (ch)
    {
    case 1:
        result1 = charachter(str);
        cout << "The count of charachter is :" << result1 << endl;
        break;
    case 2:
        result2 = spaces(str);
        cout << "The count of spaces is :" << result2 << endl;
        break;
    case 3:
        result3 = vowels(str);
        cout << "The count of of spaces is :" << result3 << endl;
        break;

    default:
        break;
    }
}
int charachter(char *string)
{
    int count = 0;
    while (*string != '\0')
    {
        count++;
        string++;
    }
    return count;
}

int spaces(char *string)
{
    int count = 0;
    while (*string != '\0')
    {
        if (*string == ' ')
        {
            count++;
        }
        string++;
    }
    return count;
}

int vowels(char *string)
{
    int count = 0;
    while (*string = '\0')
    {
        if (*string == 'A')
        {
            count++;
        }
        string++;
    }
    return count;
}