/*
This Program is indirect Recursion 
even number is one substract and odd number is one  
*/
#include <stdio.h>
int n=1;
int odd();
int even();
int odd()
{
    if(n<=10)
    {
        printf("%d ",n+1);
        n++;
        even();
    }
    
}
int even()
{
    if(n<=10)
    printf("%d ",n-1);
    n++;
    odd();
}
int main()
{
    printf("This is Output :: ");
    odd();
}

Output :

This is Output :: 2 1 4 3 6 5 8 7 10 9 
