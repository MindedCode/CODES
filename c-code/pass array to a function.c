/* Passing array to function */
#include <stdio.h>
void display(int arr[]); // pass the arr format {array name [size]}
int main()
{
    int arr[4];
    int x;
    printf("Enter the element of array\n");
    for(x=0; x<4; x++)
    scanf("%d",&arr[x]);
    printf("your display result\n");
    display(arr); // fuction call time pass only array name
}
void display(int arr[]) //  define  fuction 
{
    int x;
    for(x=0; x<4; x++)
    printf("%d\n",arr[x]);
}


Out put here:

Enter the element of array
1
2
3
45
your display result
1
2
3
45
