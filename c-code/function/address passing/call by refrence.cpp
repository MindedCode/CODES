// parameter passing / call by value
#include<iostream>
using namespace std;

int swap(int *a, int* b)
{
	int temp = *a;
	*a=*b;
	*b=temp;
	
}
int main(){
	int x;
	int y;
	int mult=0;
	cin>>x;
	cin>>y;
	
	swap(&x,&y);
	cout<<x<<endl<<y;
}

Output of the program is :

123
321
321
123
