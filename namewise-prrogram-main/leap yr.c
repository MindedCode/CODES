#include<stdio.h>

// Declare main function
int main()

{
    int year;
    printf("Enter the year ( 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048.) : ");
    scanf("%d",&year);
    
    // Declare condition
    if(year%4==0&&year%100!=0||(year%400==0))
         printf("%d year is leap yr",year);
    else
         printf("%d year is not a leap yr",year);
    
    return 0;
}

Output of the program :

Enter the year ( 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, and 2048.) : 2003
2003 year is not a leap yr
