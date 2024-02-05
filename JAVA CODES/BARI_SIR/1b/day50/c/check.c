#include <stdio.h>

int main()
{
    int x = 40;
    int si = sizeof(x);

    printf("%d\n", si);

    // int a[3][3] = {{1, 2, 3, 4},
    //                {9, 8, 7, 6},
    //                {11, 23, 43, 34}};

    int a[4][1] = {{1},{1},{1},{1}};

    // int *p = &a[0] + 1;
    // int *p = &a[0];
    // int *p = &a[0][0]+1;
    printf("%u\n", a);
    int *p = &a + 1;
    printf("This si %u\n", *p);

    // printf("%d\n", a);

    // int *p = (int *)a+1;

    // int *p = &a[0][0]+1;
    // printf("%d\n", a+1);
    // printf("%d\n", *p);

    
}