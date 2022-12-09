/*
this a swaping program using c

*/
#include<stdio.h>

int swap()   // declare function
{
    // declare variables
    int temp; 
    int a =1;
    int b =2;
    
    // this a operation
    temp = a;
    a=b;
    b=temp;
    
    printf("this is a after swaping a = %d b = %d",a,b);
    
    
}

// declare main function 
int main() 
{  
// int x,y;
    swap();
}
