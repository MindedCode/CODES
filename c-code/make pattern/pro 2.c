/*  make pattern****
      *
     **
    ***
   **** 
*/
#include <stdio.h>

int main()
{
    int n,i,j;
    printf("Enter no of lines\n");
    scanf("%d",&n);
    
    for(i=1; i<=n; i++)
    {
        for(j=1;j<=n-1;j++)
        {
            printf("  ");
        }
        // printf("\n");
    }
   
   for(j=1; j<=i; j++)
        {
            printf(" * ");
        }
    printf("\n");
}

Output of the program :

Enter no of lines
4
                         *  *  *  *  * 
