/*program of display first four multiple of a number using recursion.*/
#include<stdio.h>
int multi();
int main()
{
    int i;
    multi(10);
}

int multi(int n)    //user defined function
{
    if(n<10000) // condition
    {
        multi(n*10);  //10 multiply value of n 
        printf("\nif this output of %d",n);
    }
    printf("\nthis output of %d",n);
}
   
   
   The output of this program will be
   
   
this output of 10000
if this output of 1000
this output of 1000
if this output of 100
this output of 100
if this output of 10
this output of 10
