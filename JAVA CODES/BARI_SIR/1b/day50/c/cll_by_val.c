#include<stdio.h>

int change(int *x, int *y){
    int temp = *x;
    *x = *y;
    *y = temp;    // cpu me some limited temporory register for calculation
}
int main(){
    int a,b;  //store a garbage value;

    printf("\nbefore swepping values => %d %d\n", a,b);
    change(&a, &b);    // in passed the address/reference=> actual parameter
    printf("After swepping values => %d %d\n\n", a,b);


}