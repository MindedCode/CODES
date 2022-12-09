

#include <iostream>

using namespace std;

int main()
{
    int s=2;
    int *p;
    p=&s;
    
    cout<<p<<endl;
    cout<<&s<<endl;
    cout<<s<<endl;
    cout<<&p<<endl;
    cout<<*p;
    

    return 0;
}
