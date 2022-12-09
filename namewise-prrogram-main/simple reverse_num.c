#include<stdio.h>

//  declare reverse function
int reverse()

{
    
    int n, reverse = 0,  remainder;
    printf("Enter the integer number ::");
    scanf("%d",&n);
    
    // declare loop
    while(n!=0)
    {
        // main code operation
        remainder = n%10;
        reverse =reverse * 10 + remainder;
        n/=10;
    }
    printf("after  reverse operation :%d",reverse);
}

// declare main function 
int main()
{
    reverse();
}

Output of the program :

Enter the integer number ::123456
after  reverse operation :654321
