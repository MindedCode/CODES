#include <stdio.h>

int main()
{

    int a[] = {1, 2, 3, 45, 5};

    // size_t size = sizeof(array_name) / sizeof(array_name[0]);
    int n = sizeof(a) / sizeof(a[0]);     //acc to above arr size in byte => 20, and arr[0] element => 4B

    for (size_t i = 0; i < n; i++)
    {
        printf("%d ", a[i]);
    }

    int *p = &a[0];
    // int *p = a[0]; //Error => warning = initialization makes ptr from int without a cast [Wint -conversion]

    // a++;  //error  lvalue required as increment operand
    // p++;
    printf("\n");

    for (size_t i = 0; i < n; i++)
    {
        printf("%d ", *p++);
    }
}