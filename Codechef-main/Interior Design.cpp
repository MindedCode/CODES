// Interior Design
// Problem Code: INTRDSGN

#include <iostream>
using namespace std;

int main() {
	// your code goes here
	int t;
	
	
	cin >> t;
	while(t>0)
	{
	int x1,y1,x2,y2;
	cin>> x1 >>y1 >>x2>>y2;
	int f1 = x1+y1;
	int f2 = x2+y2;
	if(f1<f2)
	{
	    cout << f1 <<endl;
	}
	else
	{
	    cout <<f2<<endl;
	}
	t--;
	
	}
	return 0;
}


