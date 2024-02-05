#include <stdio.h>

int main()
{

    int a[3][3] = {{1, 2, 3},
                   {4, 5, 6},
                   {7, 8, 9}
                   };

    int *p = a[0];

    printf("First element of 12 byte arr \n%u ", *p);

    p = a[1];
    printf("\nSecond element of 12 byte arr \n%u ", *p);

    p = a[2];

    printf("\nThird element of 12 byte arr \n%u ", *p);
    
    // *p = &a;
    // printf("%u\n", p);

 p = (a + 1)
    printf("\n%u\n", );
    printf("%u\n", &(a[0]) + 1);
    printf("%u\n\n", &a + 1);

    printf("%u\n", *(a) + 1);
    printf("%u\n", &(a[0]) + 1);
    printf("%u\n", &a + 1);
    // printf("%u\n",a);


    return 0;
}