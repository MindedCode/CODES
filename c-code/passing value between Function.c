This program uses the function 'passing value between functions'.

that are two parameter  1 actual parameter and 2 formal parameter 

so the actual parameter is real arguments.

The formal parameter is the copied argument (values)


#include <stdio.h>
int  add(int x,int y);
int main()
{    
    int a, b, sum;
    printf("Enter two numbers a and b  :: ");
    scanf("%d%d",&a,&b);
    
    sum = add(a,b); // actual parameter
    
    printf("sum = %d\n ",sum);

  
}
int  add(int x,int y)   // formal parameter
{ 
    int z;
    d = x + y;

    return (z);
}


Output:-----------
Enter two numbers a and b  :: 1
2
sum = 3
