/*Recursion
 Recursion  function calling itself */


#include <stdio.h>
int fact(int x);
int main()
{
    int num, result;
    printf("Enter factorial number :: ");
    scanf("%d",&num);
    result=fact(num); // actual argument
    printf(" The result is ==>%d\n",result );
}
int fact(int x) // formal argument
    {
        int f;
        if (x==0)
            return 1;
        else
            f=x*fact(x-1); // fact fuction calling itself 

    return (f);
}
