#include <stdio.h>
// p_hello();
void main()
{
    printf("Hii Ganesh!");
    printf("\nHii Mahacal");
    printf("\nJai Bajrang Bali\n");
    p_hello();
    printf("%d\n",5+5);  //main();
    
    // return 0;
    // return;
}
p_hello(){     //here function is non-void 
        printf("May I know your good name ?\n");
        return;  //here function is non-void   To "return" noo write this practice.
    }



**Output this**
    _PROGRAM_

// main.c: In function ‘main’:
// main.c:8:5: warning: implicit declaration of function ‘p_hello’ [-Wimplicit-function-declaration]
//     8 |     p_hello();
//       |     ^~~~~~~
// main.c: At top level:
// main.c:14:1: warning: return type defaults to ‘int’ [-Wimplicit-int]
//    14 | p_hello(){
//       | ^~~~~~~
// main.c: In function ‘p_hello’:
// main.c:16:9: warning: ‘return’ with no value, in function returning non-void
//    16 |         return;
//       |         ^~~~~~
// main.c:14:1: note: declared here
//    14 | p_hello(){
//       | ^~~~~~~
// Hii Ganesh!
// Hii Mahacal
// Jai Bajrang Bali
// May I know your good name ?
// 10
