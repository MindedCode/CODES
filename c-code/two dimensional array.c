/*two dimentional  array */

#include<stdio.h>
int main()
{
    int i,j;
    int arr[4][3]={{1,2,3},{4,6,7},{8,9,10},{11,12,13}};
    printf("output of two dimensionAL ARRAY :: \n\n");
    for(i=0; i<4; i++)
    { 
        for(j=0; j<3; j++)
        {
        printf("%d",arr[i][j]);
        printf(" ");
        }
   printf("\n");
    }
    //       printf("%d",arr[0][0]);
    // printf("%d",arr[0][1]);
    // printf("%d\n",arr[0][2]);
    // printf("%d",arr[1][0]);
    // printf("%d",arr[1][1]);printf("%d",arr[1][2]);
    }
  
  
  Output here:
  output of two dimensionAL ARRAY :: 

  1 2 3 
  4 6 7 
  8 9 10 
  11 12 13
