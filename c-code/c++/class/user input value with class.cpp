
#include <iostream>
#include<string.h>

using namespace std;

class Student
{
    public:
    
    int id;
    string name;
    
    void put_details(int i, string n){
        id = i;
        name = n;
    }
    
    void get_details()
    {
        cout<<"\n id : "<<id<<endl;
        cout<<"name : "<<name<<endl;
    }
};

int main()
{
    Student s1;
    int s_id; 
    string s_name;
    cout<<"Enter the id: ";
    cin>>s_id;
    cout<<"Enter the name: ";
    cin>>s_name;
    s1.put_details(s_id,s_name);
    s1.get_details();

    return 0;
}
