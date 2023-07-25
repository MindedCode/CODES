

/*In this code, we have used %i for printing and scanning integers, %g for printing floating-point numbers (both float and double), and %lf specifically 
for scanning double values. Note that %g can also be used for scanning floating-point numbers, but %lf is required for scanning double values with scanf.*/


#include <stdio.h>

int main() {
    int num_int = 42;
    float num_float = 3.14;
    double num_double = 2.71828;

    // Printing using format specifiers
    printf("Integer: %i\n", num_int);
    printf("Floating-point (float): %g\n", num_float);
    printf("Floating-point (double): %lf\n", num_double);

    // Reading using format specifiers
    int input_int;
    float input_float;
    double input_double;

    printf("Enter an integer: ");
    scanf("%i", &input_int);

    printf("Enter a floating-point (float) number: ");
    scanf("%f", &input_float);

    printf("Enter a floating-point (double) number: ");
    scanf("%lf", &input_double);

    // Printing the input values
    printf("Entered Integer: %i\n", input_int);
    printf("Entered Floating-point (float): %g\n", input_float);
    printf("Entered Floating-point (double): %lf\n", input_double);

    return 0;
}


Output is:
// Integer: 42
// Floating-point (float): 3.14
// Floating-point (double): 2.718280
// Enter an integer: 23
// Enter a floating-point (float) number: 23.45
// Enter a floating-point (double) number: 34.3
// Entered Integer: 23
// Entered Floating-point (float): 23.45
// Entered Floating-point (double): 34.300000
