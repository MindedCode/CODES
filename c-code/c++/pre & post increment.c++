/******************************************************************************

#include <iostream>

using namespace std;

int main()
{
   int a,b,c,d,e;
   cin>>a>>b>>c>>d;
   e=((a++ + b++) + (c++ + ++c) - --d);
   cout<<a<<endl;
   cout<<b<<endl;
   cout<<c<<endl;
   cout<<d<<endl;
   cout<<e<<endl;
    return 0;
}
