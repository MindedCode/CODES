#include <stdio.h>
 
void main()
{
    int i, num, odd_sum = 0, even_sum = 0;
 
    printf("Enter the value of num\n");
    scanf("%d", &num);
    for (i = 1; i <= num; i++)
    {
        if (i % 2 == 0)
            even_sum = even_sum + i;
        else
            odd_sum = odd_sum + i;
    }
    printf("Sum of all odd numbers  = %d\n", odd_sum);
    printf("Sum of all even numbers = %d\n", even_sum);
}

Output of the program :

Case 1:
Enter the value of num
10
Sum of all odd numbers  = 25
Sum of all even numbers = 30
 
Case 2:
Enter the value of num
100
Sum of all odd numbers  = 2500
Sum of all even numbers = 2550
