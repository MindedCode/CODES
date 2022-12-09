#include<stdio.h>

//  declare sum Of Digit function
int sumOfDigit()

{
    
    int n, sum=0;
    printf("Enter the integer number : ");
    scanf("%d",&n);
    
    
    // declare loop
    while(n!=0)
    {
        // operation code
        sum = sum + n % 10;
        n/=10;
    }
    // display the OUTPUT
    printf("this is compute the operation : %d",sum);
}

   

// declare main function 
int main()
{
    sumOfDigit();
}

Output of the program :

Enter the integer number : 1234
this is compute the operation : 10
