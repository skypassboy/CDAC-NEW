#include"str.h"
#include<string.h>
cString::cString()
{
    len=1;
    str=new char[1];
    str[0]='\0';
}
cString::cString(const char *str)
{
    this->len=strlen(str);
    this->str=new char[this->len+1];
    strcpy(this->str,str);
}
cString::cString(cString &obj)
{
    this->len=obj.len;
    this->str=new char[this->len+1];
    strcpy(this->str,obj.str);
}
cString cString::operator=(cString &obj)
{
    this->len=obj.len;
    this->str=new char[this->len+1];
    strcpy(this->str,obj.str);
    return *this;
}
cString::~cString()
{
    delete[]str;
}
void cString::Display()
{
    cout<<"\n\t Name    : "<<str;
}