/******************************************************************************

Welcome to Online.
there is a program of factorial

*******************************************************************************/
#include <stdio.h>

int main()
{
    int fact=1,i,number;
    printf("Enter the number:");
    scanf("%d",&number);
    
    for(i=1; i<=number; i++)
    {
        fact=fact*i;
    }
    printf("there is %d factorial of = %d",number,fact);
    return 0;
}


Output of the program :

Enter the number:5 
there is 5 factorial of = 120
