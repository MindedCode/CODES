/******************************************************************************

this code use prefix increment and decrement operator 

*******************************************************************************/
#include <stdio.h>

int main()
{
    int a=1;
    printf("before increment operator =%d\n ",a);  //when before increment operater 
    ++a;
    printf("after prefix increment operator =%d",a);  //when after prefix increment operator
     ++a;
    printf("\n after prefix increment operator =%d\n",a);  //when after prefix increment operator
     ++a;
    printf("after prefix increment operator =%d",a);  //when after prefix increment operator
    

    return 0;
} 




Output hare:.............................................
before increment operator =1
 after prefix increment operator =2
 after prefix increment operator =3
after prefix increment operator =4
