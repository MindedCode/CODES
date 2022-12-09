Recursion is the process of calling functions again and again
this code is  infinite recursion 
code here
#include <stdio.h>

int main()
{
    printf("Hello World"); 
recursion();
    return 0;
}
recursion()
{
    printf("This is output Recursion ");
    recursion();
}
