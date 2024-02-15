#include <string.h>
#include <stdio.h>
int main()
{
    // short float max = 5.5 > 6.4 ? 5.5 : 6.4; // unsigned int✅   (unsigned short int) but ❌  short int ✅
    // printf("%F", max);

    // float max = 5.5 > 6.4 ? 5.5 : 6.4; // Use float instead of short float
    // printf("%f", max);                 // Use %f instead of %D => No o/p
    // // int s =00;   error
    // unsigned short int a = 9;
    // printf("%d",a);

    // char c[2] = "Adarsh";  // warning: initializer-string for array of chars is too long
    // printf("%s",c);
    // c[2,,6,,]  warning along with output shi nhi aayega.
    // char s[7] = {'A', 'd', 'a', 'r', 's', 'h', '\0'}; // warning: //excess elements in array initializer
    //                                                   //    16 |     char s[3] = {'A','d','a','r','s','s','\0'};
    // printf("%s\n", s);
    // printf(s);            // %s => str case is optional // o/p => Ada

    // printf("Hello\n");   //"Hello"  => addr of 'H'
    // printf("Hello"+1);   // "Hello"+1 => ello
    // printf("\n");
    // printf("%c\n",*("Hello"+1));  // *("Hello"+1) => e  bcoz this is Address   '*' op. deref(val at op) -> addr to find value
    // printf("%c","Hello"[1]);      //concept of array *(x+1) = x[i];
    // for (size_t i = 0; i < strlen("Hello"); i++)
    // {
        // printf("%c    ","Hello"[i]);
    // }

    // // printf("%d", int a = 4;);   error
    // printf("HEllo", "world");   this is not followed by java lang concept java in sout is expression

    // char *p = "Adarsh";
    // char *q = "Adarsh";    

    // printf("%u %u", p, q);  /// same addr    hoga   (4214884 4214884)
}