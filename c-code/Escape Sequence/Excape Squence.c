main(){
    printf("Hello World@ ! \n / // \\ \\ \\ \\");
}


// main.c:1:1: warning: return type defaults to ‘int’ [-Wimplicit-int]
//     1 | main(){
//       | ^~~~
// main.c: In function ‘main’:
// main.c:2:5: warning: implicit declaration of function ‘printf’ [-Wimplicit-function-declaration]
//     2 |     printf("Hello World@ ! \n / // \\ \\ \\ \\");
//       |     ^~~~~~
// main.c:1:1: note: include ‘<stdio.h>’ or provide a declaration of ‘printf’
//   +++ |+#include <stdio.h>
//     1 | main(){
// main.c:2:5: warning: incompatible implicit declaration of built-in function ‘printf’ [-Wbuiltin-declaration-mismatch]
//     2 |     printf("Hello World@ ! \n / // \\ \\ \\ \\");
//       |     ^~~~~~

Output is:========================================================================
// main.c:2:5: note: include ‘<stdio.h>’ or provide a declaration of ‘printf’
// Hello World@ ! 
// / // \ \ \ \


