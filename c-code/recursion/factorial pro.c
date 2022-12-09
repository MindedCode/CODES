/******************************************************************************
factorial Program using c
*******************************************************************************/
#include <stdio.h>
int factorial(int);
int main()
{   int n=10;

 printf("factorial of %d = %d",n,factorial(n));
    return 0;
}
int factorial(int n)
{  
    if(n==0)
        return 1;
    else
        return n*factorial(n-1);
       
}


O/P :

factorial of 10 = 3628800
