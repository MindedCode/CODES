/******************************************************************************

Welcome to Online.
there is a which table of program :

*******************************************************************************/
#include <stdio.h>

int main()
{
    int number, sum = 0;
    
    printf("which number of table \n");
    scanf("%d",&number);
    
    for(int i=1; i<=10; i++)
    {
        sum = i*number;
        printf(" %d * %d = %d\n",i,number,sum);
    }
    return 0;
}


Output of the program :

which number of table 
21
 1 * 21 = 21
 2 * 21 = 42
 3 * 21 = 63
 4 * 21 = 84
 5 * 21 = 105
 6 * 21 = 126
 7 * 21 = 147
 8 * 21 = 168
 9 * 21 = 189
 10 * 21 = 210


