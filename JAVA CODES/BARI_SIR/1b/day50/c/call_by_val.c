#include <stdio.h>

int call_by_val(int *a)
{
    (*a)++;
    (*a)++;
    (*a) +=1;
    *a = *a +1;
    return 0;
}

int main()
{
    printf("Call by value use address: \n");

    int x = 5;
    call_by_val(&x);
    printf("Adress of x :%d\n", &x);
    printf("Value of x: %d\n", x);

    return 0;
}