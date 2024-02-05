#include <stdio.h>

void patel() {
    printf(" Patel");
}

void singh(void (*next)()) {
    printf(" Singh");
    next();
}

void kumar(void (*next)()) {
    printf(" Kumar");
    next();
}

void adarsh(void (*next)()) {
    printf(" Adarsh");
    next();
}

void mr(void (*next)()) {
    printf("Mr.");
    next();
}

int main() {
    mr(adarsh(kumar(singh(patel))));
    return 0;
}
