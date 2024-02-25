#include <stdio.h>

int main()
{
    int x = 0b1010000;
    ~x;
    printf("%08b", x);
    printf("%d", ~x);
}

// #include <stdio.h>

// int main() {
//     // Given binary number
//     unsigned int x = 0b1010000;  // Assuming it's a binary literal in C

//     // Bitwise NOT operation
//     unsigned int result = ~x;

//     // Display the result in binary form
//     printf("Original binary: %08b\n", x);  // Assuming 32-bit integer
//     printf("Result binary:   %08b\n", result);

//     return 0;
// }
