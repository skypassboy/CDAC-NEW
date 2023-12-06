#include<iostream>
#include<string.h>
using namespace std;
class cString
{
    int len;
    char *str;
    public:
    cString();
    cString(const char*);
    cString(cString&);
    cString operator=(cString&);
    ~cString();
    void Display();
};