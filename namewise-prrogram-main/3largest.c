/******************************************************************************

Welcome to Online.
Which number is greatest or equal to three numbers

*******************************************************************************/
#include <stdio.h>

int main()
{
    int i;
    for(i=0; i<=3; i++)
    {
        int a=0;
        int b=0;
        int c=0;
        printf("Enter the first number:\n");
        scanf("%d",&a);
        printf("And enter second number:\n");
        scanf("%d",&b);
        printf("And enter the third number\n");
        scanf("%d",&c);
        
        
        
        
        if(a==b==c)
            {
                printf("a, b and c is equal to\n\n");
            }
        else if(a>b&&a>c)
            {
                printf("a is greatest number\n\n");    
            }
        else if(b>a&&b>c)
            {
                printf("b is greatest number:\n\n");
            }
        else 
            {
                printf("c is greatest:\n\n");
            }
    }
        return 0;
        
    
}



Output of the program:


Enter the first number:
1
And enter second number:
2
And enter the third number
3
c is greatest:

Enter the first number:
2
And enter second number:
1
And enter the third number
3
c is greatest:

Enter the first number:
3
And enter second number:
2 
And enter the third number
1
a is greatest number

Enter the first number:
2
And enter second number:
3
And enter the third number
1
b is greatest number:
