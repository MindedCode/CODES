/******************************************************************************

Welcome to Online.
Which number is greater or equal to Two numbers

*******************************************************************************/
#include <stdio.h>

int main()
{
    int i;
    for(i=0; i<=2; i++)
    {
        int a=0;
        int b=0;
        int c=0;
        printf("Enter the first number:\n");
        scanf("%d",&a);
        printf("And second number:\n");
        scanf("%d",&b);
        
        
        
        if(a==b)
            {
                printf("a and b is equal to\n\n");
            }
        else if(a<b)
            {
                printf("b is greatest number\n\n");    
            }
        else
            {
                printf("a is greatest number\n\n");    
            }
    }
        return 0;
     
}


Output of the program :

Enter the first number:
12
And second number:
12
a and b is equal to

Enter the first number:
13
And second number:
12
a is greatest number

Enter the first number:
1 
And second number:
12
b is greatest number

