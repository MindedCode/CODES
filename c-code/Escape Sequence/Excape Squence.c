main(){
    printf("Hello World@ ! \n / // \\ \\ \\ \\");
    printf("Hello World \\'\"");
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
// Hello World \'"

// ================================================Second program: ========================================


main(){
    printf("Hello World@ ! \n / // \\ \\ \\ \\ ///// \%%d %%d \\\\\\ " );    //firstly make pair then output single 
}




                         // some warning only below becoz no include the Header file or Preprocesive directive



// main.c:1:1: warning: return type defaults to ‘int’ [-Wimplicit-int]
//     1 | main(){
//       | ^~~~
// main.c: In function ‘main’:
// main.c:2:5: warning: implicit declaration of function ‘printf’ [-Wimplicit-function-declaration]
//     2 |     printf("Hello World@ ! \n / // \\ \\ \\ \\ ///// \%%d %%d \\\\\\ " );
//       |     ^~~~~~
// main.c:1:1: note: include ‘<stdio.h>’ or provide a declaration of ‘printf’
//   +++ |+#include <stdio.h>
//     1 | main(){
// main.c:2:5: warning: incompatible implicit declaration of built-in function ‘printf’ [-Wbuiltin-declaration-mismatch]
//     2 |     printf("Hello World@ ! \n / // \\ \\ \\ \\ ///// \%%d %%d \\\\\\ " );
//       |     ^~~~~~

Output is:========================================================================
// main.c:2:5: note: include ‘<stdio.h>’ or provide a declaration of ‘printf’
// Hello World@ ! 
//  / // \ \ \ \ ///// %d %d \\\ 


