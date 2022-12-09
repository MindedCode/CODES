/*This program is static storage class*/

#include<stdio.h>
int ex();  //initialize user defined function 
int main() 
{   
    printf("This output of = ");
    int i;
    for(i=0; i<=3; i++)
    {
        ex();
    }
}
int ex() // user defined function 
{
     int x=10; //no define static variable. this variable is 'auto'.no scope of var no main function access
    x+=10;
    printf("%d\t",x);
}

Output :
This output of = 20     20      20      20
