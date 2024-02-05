#include <stdio.h>

void fun(int *);
// void funn(int*);

// void funn(int ar[])
// {
//     printf("%d ", sizeof(ar) / sizeof(int));
//     printf("%d ", sizeof(ar) / sizeof(ar[0]));
// }

int main()
{
    int a[3] = {10, 20, 30};
    int size = sizeof(a) / sizeof(a[0]);   // here sizeof(a) is not a address treat

    // printf("%d ", size);

    // int *p = &a;   warning => initialization from incompatible ptr type [Wincompatible-pte-types]
    int *p = a;
    // int *p = &a[0];

    // for (int i = 0; i < size; i++)
    //     printf("%d ", *p++);       ////   p = p + i;
    // printf("\n");

    for (int i = 0; i < size; i++)
        printf("%d ", *(p+i));
    printf("\n");

    for (int i = 0; i < size; i++)
        printf("%d ", p[i]);
    printf("\n\n");

    // fun(p);
    // printf("%d \n", a[1]);

    // printf("\n");
    // fun(a);
    // printf("%d \n", a[1]);

    // funn(a);

    return 0;
}

// void fun(int *y)
// {
//     y++;
//     *y *= *y;

//     printf("%d ", sizeof(y));
// }

