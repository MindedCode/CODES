/******************************************************************************

Welcome to Online.
using while loop ==> there is a program of factorial

*******************************************************************************/
#include <stdio.h>

int main()
{
    int fact=1,i=1,number;
    printf("Enter the number:");
    scanf("%d",&number);
    while(i<=number)
    // for(i=1; i<=number; i++)
    {
        fact=fact*i;
        i++;
    }
    printf("there is %d factorial of = %d",number,fact);
    return 0;
}



Output of the program:

Enter the number:5
there is 5 factorial of = 120
