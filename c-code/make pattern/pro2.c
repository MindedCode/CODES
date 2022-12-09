/*  make pattern

      1
      2 3 
      4 5 6 
      7 8 9 10
      
*/
#include <stdio.h>

int main()
{
    int n,i,j,k=1;
    printf("Enter no of lines\n");
    scanf("%d",&n);
    
    for(i=1; i<=n; i++)
    {
        for(j=1;j<=i;j++)
        {
            printf(" %d ",k);
            k=k+1;
        }
        printf("\n");
    }
  
}

Output of the program :

Enter no of lines
4
 1 
 2  3 
 4  5  6 
 7  8  9  10 
