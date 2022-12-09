#include<stdio.h>
#include<math.h>

// Declare main function
int main()

{
    float principle, rate, time;
    float compound_inte;

    printf("Enter the value of principle : ");
    scanf("%f",&principle);
    
    printf("Enter the value of time : ");
    scanf("%f",&time);
    
    printf("Enter the value of rate: ");
    scanf("%f",&rate);
    
    // this is a operated formula
  
//   [ci = p(1+r/100)^t]
    compound_inte = principle * (pow((1+ rate/100),time));
    
    printf("%f is compound interest",compound_inte);
    
    Output of the program :
    
    Enter the value of principle : 1500
    Enter the value of time : 4
    Enter the value of rate: 5.8
    1879.463379 is compound interest
