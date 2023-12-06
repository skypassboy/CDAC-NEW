// writes a program to find a length of string
#include <iostream>
using namespace std;

int length(char*);

int main(void)
{

    char str[40];

    int len;
    cout << "Enter string" << endl;

    cin >> str;

    len = length(str);

    cout << "Length of string is " << len << endl;
}

int length(char *str)
{

    int count = 0;
    while (*str != '\0')
    {

        count++;
        str++;
    }
    return count;
}