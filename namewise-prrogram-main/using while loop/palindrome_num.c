#include<stdio.h>

//  declare palindrome function
int palindrome()

{
    
    int n, reverse = 0,  remainder, original;
    printf("Enter the integer number (1,121,131,141,707 etc) \n");
    scanf("%d",&n);
    original = n;
    
    // declare loop
    while(n!=0)
    {
        // operation code
        remainder = n%10;
        reverse =reverse * 10 + remainder;
        n/=10;
    }
    if(original==reverse){
        printf("this is a palindrom number :%d",original);
    }
    else
        printf("this is  not a palindrome");
}

   

// declare main function 
int main()
{
    palindrome();
}


output of the program :

Enter the integer number (1,121,131,141,707 etc) 
707
this is a palindrom number :707
