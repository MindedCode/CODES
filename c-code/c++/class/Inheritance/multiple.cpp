#include <iostream>

using namespace std;

class brands
{
    public:
    string lap1 = "Dell";
    string lap2 = "Acer";
    
    int lap_name()
    {
        cout<<"name of 1: "<<lap1<<endl;
        cout<<"name of 2: "<<lap2<<endl;
        return 0;
    }
};

class attributes
{
    public:
    string ram ="8 GB";
    string storage = "500 GB ";
    
    int  put()
    {
        cout<<"RAM: "<<ram<<endl;
        cout<<"Storage: "<<storage<<endl;
        return 0;
    }
};

class laptop :public brands, public attributes
{
    public:
    
    string name = " Dell";
    string color = "Silver";
    
    int  show()
    {
        cout<<"Name: "<<name<<endl;
        cout<<"Color: "<<color;
        return 0;
    }
    
};
    

int main()
{
   laptop l1;
   l1.lap_name();
   l1.put();
   l1.show();
   return 0;

}


The output is the : 

name of 1: Dell
name of 2: Acer
RAM: 8 GB
Storage: 500 GB 
Name:  Dell
Color: Silver
