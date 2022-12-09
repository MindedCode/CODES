As far as computing is concerned, a pointer is a variable that contains the "address of another variable".

//here code
#include <stdio.h>

int main()
{
    int a=10;
    int *ptr;
    ptr=&a;
    printf("Address of a variable :: %d\n",ptr);// display address of a variable 
    printf("value of a %d",a); // display value of a 
    printf("\n Address of a variabl %d",&a);
    

    return 0;
}
