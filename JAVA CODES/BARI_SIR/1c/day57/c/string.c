#include <stdio.h>

int main()
{
    int max = 4 > 6 ? 4 : 6;
    printf("%d ", max);

    int m = 5 > 4 ? 5 : 4;
    printf("%d ", m);

    char str[] = "Adarsh";
    // printf("%s ", str); //'%s ==> means that string -> address represent

    char str1[100] = {'A', 'D', 'A', 'R', 'S', 'H', };      //here str1 size is 100 but arr to 100 size(capacity) ki hi but free space me '\0' character store ho raha h.

    // printf("%s ", str1);     // str1 ==> &str[0]
    printf("%c ", str1[1]); // str1 ==> &str[0]   => 'H'    
    // printf("%d ", str1[50]); // str1 ==> &str[50]   => '\0' store hoga integer no. is zero(0).    
    int size = sizeof(str) / sizeof(int);
    // printf("%d ", size); // size --> 1

    // size = sizeof(str) / (str[0]);
    // printf("%d ", size); // size => 0

    size = sizeof(str) / sizeof(char);

    printf("\n%d ", size); // size --> 7

    // for (size_t i = 0; i < size; i++)
    // {
    //     printf("%c",str1[i]);
    // }
    for (size_t i = 0; i < size; i++)
    {
        printf("%s",str1[i+1]);
    }
}