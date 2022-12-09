#include <iostream>
using namespace std;

int main()
{
    int a=1,b=2,c=3;
    if(a>b)
    {
        if(a>c)
            cout<<"A is greatest"<<endl;
    }
    else
    {
        if(b>c)
            cout<<"b is gratest"<<endl;
        else
        cout<<"c is gratest";
    }
    return 0;
}


output of the program::
c is greatest
