#include <stdio.h>

int p_pattern(int n)
{
    if (n == 1)
        printf("*");
    else
    {
        printf("*");
        printf("Adarsh");
        p_pattern(n - 1);
    }
    printf("\n");
    return 0;
}
int main()
{
    printf("\nHii Ganesh!");
    p_pattern(4);
}