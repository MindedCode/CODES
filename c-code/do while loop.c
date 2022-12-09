Usually used when initializing value display and then checking condition. we don't know When the condition will be true, 

code ....
#include<stdio.h>
int main()
{
   int x=0;
    do
    {        
    printf("%d\n",x);
    x=x+1;
    }while(x<=10);
   
}
