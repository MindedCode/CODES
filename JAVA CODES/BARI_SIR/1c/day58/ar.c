#include <stdio.h>

int main()
{
    // char s[4][5] = {"abc", {5,'r',' ','y'}, {2, 4, 'u', 'k'}};
    char s[6][8] = {{'a', 'b', 'c'}, {5, 'r', ' ', 'y'}, {2, 4, 'u', 'k'}, {"ADARSH"}, {5},{'\0'}};

    int size1 = sizeof(s)/sizeof(char);
    int size2 = sizeof(s[0])/sizeof(char);

    // int size1 = sizeof(s) / sizeof(s[0]);       // Number of rows
    // int size2 = sizeof(s[0]) / sizeof(s[0][0]);  // Number of columns

    printf("%d %d \n", size1, size2);

    for (int i = 0; i < size1; i++)
    {
        for (int j = 0; j < size2; j++)
        {
            printf("%c", s[i][j]);
        }
        printf("\n");
    }
    // for (size_t i = 0; i < 4; i++)
    // {
    //     printf("%c\n",s[i][0]);
    // }

    printf("Hii");

    return 0;
}
