#include <stdio.h>
 
void main()
{
    int ival, remainder;
 
    printf("Enter an integer : ");
    scanf("%d", &ival);
    remainder = ival % 2;
    if (remainder == 0)
        printf("%d is an even integer\n", ival);
    else
        printf("%d is an odd integer\n", ival);
}


Output of the program :
Case 1:
Enter an integer : 24
24 is an even integer
 
Case 2:
Enter an integer : 75
75 is an odd integer
 
Case 3:
Enter an integer : 0
0 is an even integer
