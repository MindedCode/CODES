#include <stdio.h>

int p_arr(int arr[], int n)
{
    printf("Hii Ganesh!");
    printf("\n");

    return 0;
}
int main()
{
    int max = 4 > 7 ? 4 : 7;
    printf("Result of the max element: %d", max);
    printf("\n");

    int arr[] = {1, 2, 4, 5};
    printf("\n");
    int size = sizeof(arr) / sizeof(arr[0]);
    printf("%d ", size);
    size = sizeof(arr) / sizeof(int);
    printf("%d ", size);
    printf("\n");
    p_arr(arr, size);
}