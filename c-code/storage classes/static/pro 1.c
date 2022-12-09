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
    static int x=10;
    x+=10;      // increment value of x 
    printf("%d\t",x);
}

Output :

This output of = 20     30      40      50
