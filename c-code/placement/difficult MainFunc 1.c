
// In pass main name constant main function.


int main(main){
    printf("Hello World@ ! \n / // \\ \\ \\ \\ ///// \%%d %%d \\\\\\ " );    //firstly make pair then output single 
    int a=10, b=20, c=30;
    printf("\na = %d\nb = %d\nc = %d\n", a,b,c);
}



main.c: In function ‘main’:
main.c:1:5: warning: type of ‘main’ defaults to ‘int’ [-Wimplicit-int]
    1 | int main(main){
      |     ^~~~
main.c:2:5: warning: implicit declaration of function ‘printf’ [-Wimplicit-function-declaration]
    2 |     printf("Hello World@ ! \n / // \\ \\ \\ \\ ///// \%%d %%d \\\\\\ " );    //firstly make pair then output single
      |     ^~~~~~
main.c:1:1: note: include ‘<stdio.h>’ or provide a declaration of ‘printf’
  +++ |+#include <stdio.h>
    1 | int main(main){
main.c:2:5: warning: incompatible implicit declaration of built-in function ‘printf’ [-Wbuiltin-declaration-mismatch]
    2 |     printf("Hello World@ ! \n / // \\ \\ \\ \\ ///// \%%d %%d \\\\\\ " );    //firstly make pair then output single
      |     ^~~~~~

Output is:
      main.c:2:5: note: include ‘<stdio.h>’ or provide a declaration of ‘printf’
  Hello World@ ! 
   / // \ \ \ \ ///// %d %d \\\ 
  a = 10
  b = 20

