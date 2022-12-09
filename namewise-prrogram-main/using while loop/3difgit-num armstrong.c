/******************************************************************************

Welcome to Online.
using while loop ==> 
there is a program of three digit Armstrong number  (153, 370, 371, 407,)
there is a program of four digit Armstrong number ( 1634, 8208, 9474)

*******************************************************************************/
#include <stdio.h>

int main()
{
    int number, original_num , remainder, result=0;
    printf("Enter the three digit number: (153, 370, 371, 407,)");
    scanf("%d",&number);
    
    original_num = number;
    while(original_num != 0)
    {
        remainder = original_num % 10;
        
        result += remainder*remainder*remainder;
        original_num /= 10;
    }
    
    if(result == number)
    {
        printf("This is armstrong number = %d",result);
    }
    else
        printf("This is not armstrong number");
    return 0;
}

Output of the program :

Enter the three digit number: (153, 370, 371, 407,)407
This is armstrong number = 407
    
    
    
    
    
    
    
    /****************************************************************************************************************************8

Welcome to Online.
using while loop ==> four is a program of armstrong ( 1634, 8208, 9474)

*******************************************************************************/
#include <stdio.h>

int main()
{
    int number, original_num , remainder, result=0;
    printf("Enter the four digit number: ( 1634, 8208, 9474)");
    scanf("%d",&number);
    
    original_num = number;
    while(original_num != 0)
    {
        remainder = original_num % 10;
        
        result += remainder*remainder*remainder*remainder;
        original_num /= 10;
    }
    
    if(result == number)
    {
        printf("This is armstrong number = %d",result);
    }
    else
        printf("This is not armstrong number");
    return 0;
}

Output of the number :
Enter the four digit number: ( 1634, 8208, 9474)
8208
This is armstrong number = 8208

