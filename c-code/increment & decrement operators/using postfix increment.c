/******************************************************************************

this code use increment and decrement operator 

*******************************************************************************/
#include <stdio.h>

int main()
{
    int a=1;
    printf("before increment operator =%d\n ",a);  //when before increment operater 
    a++;
    printf("after increment operator =%d",a);  //when after increment operator
    

    return 0;
} 






Output hare:
 before increment operator =10
 after increment operator =11
 
 --------------------------------------------------------------------------
 #include <stdio.h>

int main()
{
    int x=10;
    int y;
    y=x++;
    printf("postfix using increment = %d \n",x);  // increment value of y
    
    printf("value of y = %d",y); // no increment value of y

    return 0;
}


output :

postfix using increment = 11 
value of y = 10
 
 
