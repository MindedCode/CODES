#include <stdio.h>

int main()
{
    // int max = 5 > 4 ? 5 : 4;
    // printf("%d\n", max);
    // max = 5 > 8 ? 5 : 7;
    // printf("%d\n", max);

    // char str[] = "Adarsh";
    // printf("%s\n",str);   //all string character when display then '\n' newline is character is execute.
    // printf("%s\n",str);

    // char arr[] = "Adarsh";
    // char *ptr = arr;

    char *ptr = "Adarsh"; // invalid
    // printf("%s\n",ptr);   //all string character when display then '\n' newline is character is execute.  same thing
    // printf("%s\n", ptr);    //ptr =  &ptr[0]
    // printf("%c\n",ptr);    //becoz string is follow no LSB byte aquired     ptr is poiter bcoz here ptr is address store LSB Byte
    // printf("%s\n",&ptr[0]);/// warning >>-->  expects argument of type ‘int’, but argument 2 has type ‘char *’ [-Wformat=]
    // printf("%s\n",&ptr[0]);  //full string display
    // printf("%s\n",&ptr[0]);  //full string display
    // printf("%s\n",&ptr[0]);  //full string display
    printf("%s\n", &ptr[4]);   // full string display
    printf("%s ", (ptr+3));   //ptr is dereferencing.  jo ki integer ho jayega
    printf("%s\n", (ptr + 3)); // full string display  this line is not working I don't know  bcoz b4 to is ptr is store addr why u can string is addr.
    printf("%s\n", (ptr + 4)); // full string display  this line is not working I don't know  bcoz b4 to is ptr is store addr why u can string is addr.
    printf("Hellow");


    // printf("%s\n", ptr[4]);    //ptr is dereferencing.  jo ki integer ho jayega ( why no display output.    *(ptr+3)ptr[4] => *(ptr[4])

}