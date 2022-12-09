/******************************************************************************

*******************************************************************************/
#include <stdio.h>

int fact(int);

int main()
{
   int n, result;
   printf("Enter the number : ");
   scanf("%d",&n);
   result =fact(n);
   printf("\n The factorial of %d",n, result);

    return 0;
}
int fact(int x)
{
    if(x==1)
    {
        return (x);
    }
    else 
    {
        return  (x * fact(x - 1));
    }
}
