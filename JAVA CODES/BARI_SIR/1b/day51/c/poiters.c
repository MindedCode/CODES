#include <stdio.h>

int max( int x, int y){
    return x<y ? y : x;
}
int main(){
    printf("%u \n", max(4,6));

    int a[] = {1,33,44,55};

    printf("%u \n", a);
    // printf("%u \n", a[]);
    printf("%u \n", &a[0]);
    printf("%u \n", &a[1]);
    printf("%u \n", &a[2]);
    printf("%u \n", &a[3]);
}