#include <stdio.h>
int p_hello();
// int pr(int);
int main(int argc, char const *argv[])
{
    printf("Hii Ganesh!");
    printf("\nHii Mahacal");
    printf("\nJai Bajrang Bali\n");
    p_hello();

    int a = 3;
    int b = 4;
    int c = a + b;

    printf("%d %d %d\n", a, b, c);

    printf("%d\n", a);
    printf("%d\n", a + 4);
    printf("%d\n", a + 10);
    printf("%d\n", a + 5);

    return 0;
}

int p_hello()
{
    printf("May I know your good name ?");
    int a = 3;
    int b = 4;
    int c = a + b;

    printf("%d %d %d\n", a, b, c);

    printf("%d\n", a);
    printf("%d\n", a + 4);
    printf("%d\n", a + 10);
    printf("%d\n", a + 5);
}
