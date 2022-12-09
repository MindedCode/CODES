/******************************************************************************

this code use prefix decrement and decrement operator 

*******************************************************************************/
#include <stdio.h>

int main()
{
    int a=1;
    printf("before decrement operator =%d\n ",a);  //when before decrement operater 
    --a;
    printf("after prefix decrement operator =%d",a);  //when after prefix decrement operator
     --a;
    printf("\n after prefix decrement operator =%d\n",a);  //when after prefix decrement operator
     --a;
    printf("after prefix decrement operator =%d",a);  //when after prefix decrement operator
    

    return 0;
} 

Output hare:
before decrement operator =1
 after prefix decrement operator =0
 after prefix decrement operator =-1
after prefix decrement operator =-2
