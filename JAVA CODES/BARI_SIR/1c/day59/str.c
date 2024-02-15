#include <stdio.h>

int main()
{
    int max = 4 > 5 ? 4 < 5 ? 5 : 4 : 5;

    // printf("%d ", max);

    char str[] = "adarsh";

    // printf("%s ", str + 1);

    char *ptr = str;

    ptr[1] = 'u';

    printf("%s",ptr);

    char *p = "kumar";

    p[1] = 'o';   //*(p+1)    *p string read only mem area.

    printf("\n%s",p);



    char *q = "Adarsh";
    q[1] = 'u';
    q = "Kumar";


    // printf("%s ", &str[0]+0 );
    // printf("%s ", str+0);   //&str[0]



    // printf("%c ", *(ptr + 0));



    // for (size_t i = 0; i < 7; i++)
    // {
    //     printf("%c ", *(ptr + i));
    // }

    // for (size_t i = 0; i < 7; i++)
    // {
    //     printf("\n%c ", ptr[i]);    //*(ptr + 0) = > ptr[0] <=>   ptr = &ptr[0]
    // }
}