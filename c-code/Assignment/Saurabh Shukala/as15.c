/******************************************************************************
                    RECURSIONS PROBLEMS
    . Write a recursive function to print first N natural numbers
    . print first N natural numbers in reverse order
    . print first N odd natural numbers
    . first N odd natural numbers in reverse order
    . first N even natural numbers
    . To print squares of first N natural numbers
    . find the nth term of Fibonacci series.
    
            TSRS
    . calculate sum of first N natural numbers
    . calculate sum of squares of first n natural numbers
    . sum of digits of a given number
    . calculate factorial of a given number
    

*******************************************************************************/
#include <stdio.h>

void printN(int n){
        if(n==0){
            printf("natural Numbers: " );
            return;  // n>0
        }
        printN(n-1);
        printf("%d ",n);
}
void printRNum(int n){
    if(n>0){
        
        printf("%d ", n);
        printRNum(n-1);
    }
}   
void firstNOddNum(int n) {
    if (n == 0) {
        printf("Odd Natural Numbers: ");
        return;
    }
    firstNOddNum(n - 1);
    int oddNumber = 2 * n - 1;
    printf("%d ", oddNumber);
}
void firstNReveseOddNum(int n) {
    if(n>0)
    {
        printf("%d ", 2 * n - 1);
        firstNReveseOddNum(n-1);
        
    }
}
void firstEven(int n){
    if(n>0){
        firstEven(n-1);
        printf("%d ", n+1);
    }
}
void firstREven(int n){
    if(n==0){
        return;
    }
    printf("%d ", n+1);
    firstREven(n-1);
}

void firstSqr(int n){
    if(n==0){
        return;
    }
    firstSqr(n-1);
    printf("%d ", n*n);
}
void firstRSqr(int n){
    if(n==0){
        return;
    }
    printf("%d ", n*n);
    firstRSqr(n-1);
}

void fib(int n, int a, int b, int c){
   if(n == c ){
       return;
   } 
    printf("%d ", a);
   fib(n, b, a+b, c+1);
}

int sumOfNatu(int n){
    if(n==0){
        return 0;
    }
    // int sum = 0;
    return n + sumOfNatu(n-1);
}
int SumofSqr(int n){
    if(n<=0){ // n==0    X n>0 base case first time is run 
        return 0;
    }
    return (n*n) + SumofSqr(n-1);
}
int sumOfD(int n){
    if(n<=0){
        return 0;
    }
    return n%10 + sumOfD(n-1);
}
int fact(int n){
    if(n<=0){
        return 1;
    }
    return n * fact(n-1);
}
int main()
{
    int n = 5;
    printN(n);
    printf("\nReverse N natural Numbers: ");
    printRNum(n);
    printf("\n");
    firstNOddNum(n);
    printf("\nReverse N odd natural Numbers: ");
    firstNReveseOddNum(n);
    printf("\nFirst even: ");
    firstEven(n);
    printf("\nfirst Reverse Even numbers: ");
    firstREven(n);
    printf("\nfirst Squres numbers: ");
    firstSqr(n);
    printf("\nfirst Reverse Squres numbers: ");
    firstRSqr(n);
    
    printf("\nThe Fibonacci series: ");
    fib(n, 0, 1, 0);
    
    int result = sumOfNatu(n);
    printf("\n Sum of natural numbers: %d ", result);
    result = SumofSqr(n);
    printf("\nsum of N natural numbers: %d", result);
    result = sumOfD(n);
    printf("\nSum of digit: %d", result);
    result = fact(n);
    printf("\nFactorial of N numbers: %d", result);
    return 0;
}



Output is:
// natural Numbers: 1 2 3 4 5 
// Reverse N natural Numbers: 5 4 3 2 1 
// Odd Natural Numbers: 1 3 5 7 9 
// Reverse N odd natural Numbers: 9 7 5 3 1 
// First even: 2 3 4 5 6 
// first Reverse Even numbers: 6 5 4 3 2 
// first Squres numbers: 1 4 9 16 25 
// first Reverse Squres numbers: 25 16 9 4 1 
// The Fibonacci series: 0 1 1 2 3 
//  Sum of natural numbers: 15 
// sum of N natural numbers: 55
// Sum of digit: 15
// Factorial of N numbers: 120

