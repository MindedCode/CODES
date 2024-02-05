#include <stdio.h>

int main()
{

    printf("\nHii Ganesh");

    int a = 22;
    // int p = &a;
    int *pp = &a;
    printf("\n%d\n %d\n %d\n", &a, *&pp, pp);
    printf("%d\n", *pp);

    static int arr[4];
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", arr[i]);
    }

    printf("\n");
    int ar[4];
    for (int i = 0; i < 5; i++)
    {
        printf("%d ", ar[i]);
    }

    printf("\n");
    int ar1[10] = {22, 333};
    int size = sizeof(ar1) / sizeof(ar1[0]);
    for (int i = 0; i < size; i++)
    {
        printf("%d ", ar1[i]);
    }

    printf("\n");
    static  int ar2[10] = {22, 99,33};
    for (int i = 0; i <= 12; i++)
    {
        printf("%d ", ar2[i]);
    }


    // printf("\n");    X No valid  bcoz arr size is a only '2' =>  1,2   but store value is three.
    // static  int ar3[2] = {22, 99,33};
    // for (int i = 0; i < 4; i++)
    // {
    //     printf("%d ", ar3[i]);
    // }


printf("\n");
    int x = (4); 
    int y = {4};
    // int z = [5];
    // int za = *5*;   //X
    printf("%d\n",x);
    printf("%d\n",y);
    printf("%d\n",z);
    // printf("%d\n",za);


    return 0;
}