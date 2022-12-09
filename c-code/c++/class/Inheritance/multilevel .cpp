#include<iostream>
using namespace std;

class grand{
    public:
    string name;
    
    void get_n(string n){
        name=n;
    }
    
    void put_n(){
        cout<<"GrandParent name is: "<<name<<endl;
    }
};

class parent: public grand{
    public:
    int age;
    
    void get_age(int a)
    {
        age=a;
    }
    
    void put_age(){
        cout<<"Parent age:"<<age<<endl;
    }
};

class child:public parent{
    public:
    string gender;
    void get_g(string g){
        gender=g;
    }
    
    void put_g()
    {
        cout<<"child gender: "<<gender;
    }
};


int main(){
    
    child c;
    
    c.get_n("Sid");
    c.put_n();
    c.get_age(22);
    c.put_age();
    c.get_g("male");
    c.put_g();
    
    
    return 0;
}

output is ::

GrandParent name is: Sid
Parent age:22
child gender: male
