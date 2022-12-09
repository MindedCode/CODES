#include<iostream>
#include "adarshcls.cpp"
using namespace std;

int main()
{
	int a;
	cout<<"Enter the a number : "<<endl;
	cin>>a;
	
	Adarsh *ob=new Adarsh(a);
	
	cout<<ob->num;
	
	
}

Output of the program ::
Enter the a number :
2
2
--------------------------------
