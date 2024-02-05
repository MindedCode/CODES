#include <stdio.h>

// Function to calculate Fibonacci number recursively
int fibonacci(int n) {
    if (n <= 1) {
        return n;
    } else {
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}

int main() {
    int n;

    printf("Enter the number of terms for Fibonacci series: ");
    scanf("%d", &n);

    printf("Fibonacci series:\n");
    for (int i = 0; i < n; i++) {
        printf("%d ", fibonacci(i));
    }

    return 0;
}
