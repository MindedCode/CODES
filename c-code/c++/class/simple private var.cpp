/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
#include <iostream>

using namespace std;

class Hero{
  
  int health;
  char level;
  public:
  
  int Get_health(){
      return health;
  }
  void Set_health(int h){
      health = h;
  }
  char Get_level(){
      return level;
  }
  void Set_level(char h){
      level = h;
  }
};

//Access private variable


int main()
{
    Hero adarsh;
    cout<<"Access private variable \n"<<endl;
    adarsh.Set_health(1000);
    adarsh.Set_level('A');
    cout<<"adarsh health is: "<<adarsh.Get_health()<<endl;
    cout<<"adarsh level is : "<<adarsh.Get_level()<<endl;

    return 0;
}

Output of the program::

Access private variable 

adarsh health is: 1000
adarsh level is : A
