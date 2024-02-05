#include <stdio.h>

int main()
{
    int n;

    printf("Enter the number of terms for Fibonacci series: ");
    scanf("%d", &n);

    int first = 0, second = 1, next;

    printf("Fibonacci series:\n");

    for (int i = 0; i < n; i++)
    {
        printf("%d ", first);

        next = first + second;
        first = second;
        second = next;
    }

    return 0;
}
