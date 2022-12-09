

#include <iostream>

using namespace std;

class Val{
    public:
  int a;
  int b;
  
  Val(int x, int y){
      a=x;
      b=y;
    //   cout<<a<<b<<endl;
  }
  
  void print()
  {
      cout<<"a "<<a<<endl;
      cout<<"b "<<b;
  }
};
int main()
{   
    Val v(1,2);
    v.print();
   

    // return 0;
}
