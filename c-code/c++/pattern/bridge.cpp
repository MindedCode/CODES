/******************************************************************************

                              Online C++ Compiler.
               Code, Compile, Run and Debug C++ program online.
Write your code in this editor and press "Run" button to compile and execute it.

*******************************************************************************/

#include <iostream>

using namespace std;

int main()
{
    int n; cin>>n;
    int i=1;
    while(i<=n)
    {
        int col=1;
        while(col<=n-i+1){
            cout<<col << " ";
         col++;
        }
        int star = 1;
        while(star<=i-1){
            cout<<"*"<<" ";
            star++;
        }
    
    
        int trd = i-1;
        while(trd){
            cout<<"*"<<" ";
            trd--;
        }
        
        int fourth =1;
        
        while(fourth<=n-i+1){
            int val=n-fourth+i;
            cout<<val<<" ";
            // val++;
            fourth++;
        }
        
        cout<<endl;
        i++;
        
    }

    return 0;
}
