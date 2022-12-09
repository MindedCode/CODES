#include <stdio.h>
#include <math.h>
#include <stdlib.h>
 
void main()
{
    int n, x1;
    float accuracy, term, denominator, x, sinx, sinval;
 
    printf("Enter the value of x (in degrees) \n");
    scanf("%f", &x);
    x1 = x;
    /*  Converting degrees to radians */
    x = x * (3.142 / 180.0);
    sinval = sin(x);
    printf("Enter the accuracy for the result \n");
    scanf("%f", &accuracy);
    term = x;
    sinx = term;
    n = 1;
    do
    {
        denominator = 2 * n * (2 * n + 1);
        term = -term * x * x / denominator;
        sinx = sinx + term;
        n = n + 1;
    } while (accuracy <= fabs(sinval - sinx));
    printf("Sum of the sine series = %f \n", sinx);
    printf("Using Library function sin(%d) = %f\n", x1, sin(x));
}


Output of the program :

Enter the value of x (in degrees)
60
Enter the accuracy for the result
0.86602540378443864676372317075294
Sum of the sine series         = 0.855862
Using Library function sin(60) = 0.866093
 
$ a.out
Enter the value of x (in degrees)
45
Enter the accuracy for the result
0.70710678118654752440084436210485
Sum of the sine series         = 0.704723
Using Library function sin(45) = 0.707179
