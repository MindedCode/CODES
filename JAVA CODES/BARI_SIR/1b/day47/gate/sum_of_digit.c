#include <stdio.h>

int sum_recursion(int n)
{
    if (n == 0)
        return 0;
    return n % 10 + sum_recursion(n / 10);
}

int sum_digit(int n)
{
    int sum = 0;
    // printf("%d\n",sum);   // initialized very must
    while (n > 0)
    {
        sum += (n % 10);
        n /= 10;
    }
    printf("%d", sum);
    // return sum;
}
int main()
{
    printf("\nHii People!\n");
    sum_digit(126);

    printf("\n\n");

    int result = sum_recursion(126);
    printf("%d", result);
    return 0;
}