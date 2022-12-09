 
#include <iostream>
#include <cstring>
using namespace std;

int main()
{
    char a[]="Adarsh";
    char b[] = "Kumar";
    char c[] = "\n";
    char d[] = "\0";
    char e[] = {'a', 'b', 'c', 'd', '\0'};
    
    for(int i=0; i<5; i++){
        // cout<<e[i]<<endl;
        cout<<e[i]<<endl;
    }
    
    cout<<a <<" "<<b<<" "<<c<<"null char"<<d<<" "<<e[3]<<endl;
    
    cout<<"a,b,c,d,e of length "<<strlen(a)<<strlen(b)<<strlen(c)<<strlen(d)<<strlen(e)<<endl;
    
    
    cout<<strcpy(a,b)<<" "<<strcpy(b,c)<<endl<<"Null character: "<<strcpy(c,d)<<" "<<strcpy(d,e)<<endl;
    cout<<"Value of a "<<a<<endl;
    cout<<"Value of b "<<b<<endl;
    cout<<"Value of c "<<c<<endl;
    cout<<"Value of d "<<d<<endl;
    cout<<"Value of e "<<e<<endl;
    cout<<"a,b,c,d,e of length "<<strlen(a)<<strlen(b)<<strlen(c)<<strlen(d)<<strlen(e)<<endl;
    
    cout<<strcat(a,b)<<"new line character "<<strcat(b,c)<<"void character "<<strcat(c,d)<<" "<<strcat(d,e)<<endl;
     cout<<"Value of a "<<a<<endl;
    cout<<"Value of b "<<b<<endl;
    cout<<"Value of c "<<c<<endl;
    cout<<"Value of d "<<d<<endl;
    cout<<"Value of e "<<e<<endl;
    
    cout<<"a,b,c,d,e of length "<<strlen(a)<<" "<<strlen(b)<<" "<<strlen(c)<<" "<<strlen(d)<<" "<<(e)<<endl;
     cout<<"Value of a "<<a<<endl;
    cout<<"Value of b "<<b<<endl;
    cout<<"Value of c "<<c<<endl;
    cout<<"Value of d "<<d<<endl;
    cout<<"Value of e "<<e<<endl;
    
    

    return 0;
}

Output of the Program: 

a
b
c
d

Adarsh Kumar 
null char d
a,b,c,d,e of length 65104
Kumar 

Null character:  adcd
Value of a Kumar
Value of b 

Value of c 
Value of d adcd
Value of e cd
a,b,c,d,e of length 51042
Kumar
new line character 
void character adcd cd
Value of a Kumar

Value of b 

Value of c adcd
Value of d cd
Value of e 
a,b,c,d,e of length 6 1 4 2 
Value of a Kumar

Value of b 

Value of c adcd
Value of d cd
Value of e 

