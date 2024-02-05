#include <stdio.h>

int yadav() {
    printf(" Yadav");
    return 0;
}

void divyansh(int (*arg_as_fn)()) {
    printf("Divyansh");
    arg_as_fn();
}

void mr(void (*arg_as_fn_call_divyansh_fun)()) {
    printf("Mr. ");
    arg_as_fn_call_divyansh_fun();
}

int main() {
    printf("Mr. Adarsh Kumar \n");

    mr(divyansh(yadav));

    return 0;
}
