#include <iostream>

using namespace std;

class Ractangle{
    public:
    
  int a=2;
  int b=8;
};

class Multiply: public Ractangle{
    public:
    
    int area(int x, int y){
        return (x*y);
    }
};

int main()
{
    Multiply m;
    cout<<"Area of Ractangle: "<<m.area(m.a, m.b);
    return 0;
}

