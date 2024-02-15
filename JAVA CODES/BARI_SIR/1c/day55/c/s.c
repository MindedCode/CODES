#include <stdio.h>
#include <string.h>
int main()
{
    char char_arr[6] = {'1', '2', '3', '4', '5', '\0'}; /// warning: excess elements in array initializer char_arr[5] = size = sizeof(char_arr)/sizeof(char_arr[0]);
    printf("%s ", char_arr);

    int size = sizeof(char_arr) / sizeof(char_arr[0]);
    printf("\n");
    // for(int i=0; i<size; i++){
    //     printf("%c ", char_arr[i]);
    // }

    char str[] = "Adarsh";
    char *q = str; //&str[0]
    printf("Display the name: ");
    printf("%c ", *(q + 0));   // q[0]
    printf("%c ", *(q + 1));  // q[1]
    printf("%c ", *(q + 2)); // q[2]
    printf("%c ", *(q + 3)); // q[3]
    printf("%c ", *(q + 4));  // q[4]
    printf("%c ", *(q + 5));   // q[5]
    // printf("%c ", *(q + 6));   // q[6]

    printf("\n");

    q[4] = 'D';
    size = sizeof(str) / sizeof(char);
    for (size_t i = 0; i < size; i++)
    {
        printf("%c ", q[i]);
    }
    
    // printf("%c"*q); //error:  "U declare the strng =>"Adarsh" //dereferencing ==> address to fetch value/
    // printf("%s",*q); //Invalid
    printf("%s",str);

    // str[6] = "Kumar";
    strcpy(str," Kumar");
    printf("%s",str);

    // str[8] = "Singh\0";
    strcpy(str, " Singh");
    printf("%s",str);
}