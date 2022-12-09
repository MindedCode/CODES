
#include <iostream>
#include<string.h>

using namespace std;

class Student
{
    public:
    
    int id;
    string  name;
    
    void get_details(){
        cout<<" id:"<<id<<endl;
        cout<<"name"<<name;
    }
};




int main()
{
    Student s1;
    s1.id = 5;
    s1.name = " Sid";
    s1.get_details();

    return 0;
}
