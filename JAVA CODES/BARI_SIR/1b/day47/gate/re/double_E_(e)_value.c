#include <stdio.h>

int main() {
    double number = 1.0;

    printf("Initial value: %.2lf\n", number);

    for (int i = 1; i <= 30; i++) {
        number *= 2.0;
        printf("After doubling %d time(s): %.2lf\n", i, number);
    }

    return 0;
}
