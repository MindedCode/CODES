#include <stdio.h>

int main() {
    register int arr[50];

    // Initialize the array elements with values from 0 to 49
    for (register int i = 0; i < 50; i++) {
        arr[i] = i;
    }

    // Print the values of the array elements
    for (int i = 0; i < 50; i++) {
        printf("arr[%d] = %d\n", i, arr[i]);
    }

    printf("Register code here with Adarsh");

    return 0;
}
